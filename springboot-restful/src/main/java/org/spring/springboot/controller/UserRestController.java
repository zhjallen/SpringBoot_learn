package org.spring.springboot.controller;


import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<User> findAllUser() {

        return userService.getUsers();
    }

}
