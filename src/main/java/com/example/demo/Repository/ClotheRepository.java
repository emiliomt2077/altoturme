/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Models.Clothe;
import com.example.demo.Repository.CRUD.ClotheCRUD;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author unPandicornio
 */

@Repository
public class ClotheRepository {
    @Autowired
    private ClotheCRUD clotheCRUD ;
    
    public List<Clothe> getAll() {
        return clotheCRUD.findAll();
    }
    
    public Optional<Clothe> getByReference(String reference) {
        return clotheCRUD.findByReference(reference);
    }
    
    public Clothe save(Clothe clothe) {
        return clotheCRUD.save(clothe);
    }
    
    public void delete(String reference) {
        clotheCRUD.deleteByReference(reference);
    }
    
}
