package org.sda.controller;

import org.sda.entities.User;
import org.sda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("user",new User());
        return "user/user-create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {

        try {
            userService.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:all";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {

            userService.deleteById(id);

        return "redirect:/user/all";
    }



}
