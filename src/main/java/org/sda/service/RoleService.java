package org.sda.service;

import org.sda.entities.Role;
import org.sda.entities.User;
import org.sda.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Role findByRoleType(String roleType) {
        Optional role = roleRepository.findByRoleType(roleType);
        return (Role) role.get(); // (Role) am convertit un obiect de tip Optional in Role (Casting)
    }
}
