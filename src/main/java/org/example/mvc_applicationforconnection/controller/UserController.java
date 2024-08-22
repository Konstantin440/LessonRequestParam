package org.example.mvc_applicationforconnection.controller;


import lombok.RequiredArgsConstructor;
import org.example.mvc_applicationforconnection.model.User;
import org.example.mvc_applicationforconnection.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @GetMapping("/view-users")
    public String getViewUsers(Model model) {
        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);
        return "view-users";
    }

    @GetMapping("/add-user")
    public String getAddUser() {
        return "add-user";
    }

    @PostMapping("/view-users")
    public String postViewUsers(
            @RequestParam("username") String login,
            @RequestParam("password") String password,
            Model model) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        userService.save(user);

        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);

        return "view-users";
    }


}


