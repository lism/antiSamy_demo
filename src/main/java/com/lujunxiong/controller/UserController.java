package com.lujunxiong.controller;

import com.lujunxiong.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.lujunxiong.controller-> UserController
 * @author: junxiong.lu
 * @createDate: 2021-10-06 11:49
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    public String save(User user){
        System.out.println("UserController save.... " + user);
        return user.getName();
    }

}
