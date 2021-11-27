/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository.CRUD;

import com.example.demo.Models.Clothe;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author unPandicornio
 */
public interface ClotheCRUD extends MongoRepository<Clothe, Integer>{
    
    public Optional<Clothe> findByReference(String reference);

    public void deleteByReference(String reference);
    
}
