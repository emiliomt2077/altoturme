/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Models.User;
import com.example.demo.Repository.CRUD.UserCRUD;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author unPandicornio
 */

@Repository
public class UserRepository {
    
    @Autowired
    private UserCRUD userCRUD ;
    
    public List<User> getAll() {
        return userCRUD.findAll();
    }
    
    public Optional<User> getById(Integer id) {
        return userCRUD.findById(id);
    }
    
    public Optional<User> getEmail(String email) {
        return userCRUD.findByEmail(email);
    }
    
    public List<User> getByBirthday(Integer monthBirthtDay) {
        return userCRUD.findAllByMonthBirthtDay(monthBirthtDay);
    }
    
    public User save(User user) {
        return userCRUD.save(user);
    }
    
    public void delete(Integer id) {
        userCRUD.deleteById(id);
    }

    public User getEmailandPassword(String email, String password) {
        return userCRUD.findByEmailAndPassword(email, password);
    }
    
}