package org.sda.controller;

import org.sda.entities.User;
import org.sda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String getUsers(Model model) {
        List<User> allUsers = userService.findAll();

        model.addAttribute("users", allUsers);
        return "user/user-all";

    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {

        try {
            userService.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/user/all";
    }

    @RequestMapping("/create")
    public String goToCreate(Model model) {
        model.addAttribute(new User());
        return "user-create";
    }

}
