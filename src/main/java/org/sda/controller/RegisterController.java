package org.sda.controller;

import org.sda.entities.User;
import org.sda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/register")
    public String index() {
        return "register";
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }



    @PostMapping("/register")
    public String registerUser(String username, String password, String email) {


        User user = new User();

        try {
            if (email != null)
                user.setEmail(email);
            user.setPassword(encoder().encode(password));
            user.setUsername(username);

            userRepository.save(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/login";


    }
}