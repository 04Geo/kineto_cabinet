package org.sda;

import org.sda.entities.*;
import org.sda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
    @Autowired
    UserRepository userRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;


    @Override
    public void run(String... args) throws Exception {
//        try{
//            userRepository.deleteById(1);
//        }catch(Exception ex){
//
//        }
    }
}
