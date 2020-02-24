package com.infosys.services;

import com.infosys.model.Role;
import com.infosys.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Roleservice{

    @Autowired
    private RoleRepository roleRepository;

    public Role create(Role role){
        return roleRepository.saveAndFlush(role);
    }

    public Role findRoleById(Integer id){
        return roleRepository.findRoleById(id);
    }




 




}