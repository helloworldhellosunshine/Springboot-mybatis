package cn.zcbigdata.mybits_demo.controller;


import cn.zcbigdata.mybits_demo.entity.User;
import cn.zcbigdata.mybits_demo.service.UserService;
import com.sun.deploy.net.HttpRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

    private final Logger logger = Logger.getLogger(this.getClass());


    @Autowired
    private UserService userService;

    /**
     * 查
     * @param id
     * @return
     */
    @RequestMapping("getUser/{id}/{userName}")
    public String GetUser(@PathVariable int id,@PathVariable String userName){
        logger.info("log4j test");
        return userService.Select(id).toString();
    }

    /**
     * 增
     */
    @RequestMapping("InsertUser")
    public void insert(){
        User user = new User();
        user.setUserName("admin1");
        user.setPassWord("123456");
        user.setRealName("管理员1");
        int flage =  userService.Insert(user);
    }

}
