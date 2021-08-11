package org.sda.service;

import org.sda.entities.User;
import org.sda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        Optional user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new NoSuchElementException("Userul cu " + id + " nu a fost gasit!");
        }
        return (User) user.get();
    }


    public User save (User user) throws Exception {
        if (user.getEmail() != null){
        return userRepository.save(user);
        }
        throw new  Exception("User already registered");
    }


    public User update(User user) {

        return userRepository.save(user);

    }

    public void deleteById(Integer id) {

        userRepository.deleteById(id);

    }


}
