package cn.zcbigdata.mybits_demo.controller;


        import cn.zcbigdata.mybits_demo.entity.User;
        import cn.zcbigdata.mybits_demo.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 查
     * @param id
     * @return
     */
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
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
