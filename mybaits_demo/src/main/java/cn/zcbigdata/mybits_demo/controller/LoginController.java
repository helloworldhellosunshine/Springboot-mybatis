package cn.zcbigdata.mybits_demo.controller;

import cn.zcbigdata.mybits_demo.entity.Manager;
import cn.zcbigdata.mybits_demo.entity.Student;
import cn.zcbigdata.mybits_demo.entity.Teacher;
import cn.zcbigdata.mybits_demo.service.ManagerService;
import cn.zcbigdata.mybits_demo.service.StudentService;
import cn.zcbigdata.mybits_demo.service.TeacherService;
import cn.zcbigdata.mybits_demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private ManagerService managerService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("{ip}")
    public String ip(@PathVariable String ip){
        return ""+ip+"";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody  //返回json类型的数据
    public String login(@RequestParam("flag") String flag, @RequestParam("account") String account,  @RequestParam("password") String password){
        Integer integerflag = Integer.valueOf(flag);

        if (integerflag == 0){
            Manager manager = managerService.find(account);
            if (manager.getPassword().equals(password)){
                return manager.getUsername();
            }
        }else if(integerflag == 1){
            Student student = studentService.find(account);

            if(student.getPassword().equals(password)){
                return student.getPassword();
            }

        }else{
            Teacher teacher = teacherService.find(account);

            if (teacher.getPassword().equals(password)){
                return teacher.getUsername();
            }
        }

        return "";
        
    }

}
