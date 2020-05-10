package com.ex1.springboot.web;

import com.ex1.springboot.dao.UserDAO;
import com.ex1.springboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // RestController 直接返回JSON数据
@RequestMapping("/api")
public class UserController {
    @Autowired//自动装配，就是自动帮你get/set
            UserDAO userDAO;

    //查询全部用户
    @RequestMapping("/listUserinfo")//api接口
    public List<Users> listUserinfo() throws Exception {
        return userDAO.findAll();//List类型会自动转换为JSON
    }

    //查询某个用户
    @RequestMapping("/finduser")
    public Users findUser(@RequestParam(value = "username") String username) {
        List<Users> userlist = userDAO.findByName(username);
        Users user = userlist.get(0);
        System.out.println(user.getName() + '\n' + user.getPwd());
        return user;
    }

    //查询某个用户和密码是否相同
    @RequestMapping("/checkpwd")
    public String checkpwd(@RequestParam(value = "pwd") String pwd, @RequestParam(value = "username") String username) throws Exception {
        try {
            List<Users> userlist = userDAO.findByName(username);
            Users user = userlist.get(0);
            System.out.println("input密码: " + pwd + "\nreal密码: " + user.getPwd());
            if (user.getPwd().equals(pwd)) {
                return String.valueOf(user.getId());
            }
        } catch (Exception e) {
            return "false";
        }
        return "false";
    }


    //创建一个新用户
    @RequestMapping("/addUser")
    public Boolean addUser(@RequestParam(value = "username") String username, @RequestParam(value = "pwd") String pwd) throws Exception {
        try {
            Users users = new Users();
            users.setName(username);
            users.setPwd(pwd);
            userDAO.save(users);
            System.out.println("add用户: " + username + "\n密码: " + pwd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
