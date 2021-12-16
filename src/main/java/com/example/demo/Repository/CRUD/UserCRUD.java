/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository.CRUD;

import com.example.demo.Models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author unPandicornio
 */
public interface UserCRUD extends MongoRepository<User, Integer>{
    @Query
    public Optional<User> findByEmail(String email);   
    public List<User> findAllByMonthBirthtDay(Integer monthBirthtDay);
    public User findByEmailAndPassword(String email, String password);
}

