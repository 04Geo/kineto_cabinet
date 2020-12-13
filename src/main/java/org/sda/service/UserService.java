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
    UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll() {
        return userRepository.findAll();
    }

//    public User findById(Integer id) {
//        Optional user = userRepository.findById(id);
//        if (!user.isPresent()) {
//            throw new NoSuchElementException("Userul cu " + id + " nu a fost gasit!");
//        }
//        return (User) user.get();
//    }


    public User save (User user) throws Exception {
//        if (employee.getAddress() != null && employee.getAddress().size() > 0){
        return userRepository.save(user);
//        }
//        throw new  Exception("Cannot create an Employee without an Address");
    }

    public User update(User user) {

        return userRepository.save(user);

    }

    public void delete(Integer id) {

        userRepository.deleteById(id);

    }

}
