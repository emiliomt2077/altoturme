/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Models.Order;
import com.example.demo.Repository.CRUD.OrderCRUD;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author unPandicornio
 */
@Repository
public class OrderRepository {
    private OrderCRUD userCRUD ;
    
    public List<Order> getAll() {
        return userCRUD.findAll();
    }
    
    public List<Order> getAllByZone(String zone) {
        return userCRUD.findAllBySalesManZone(zone);
    }
    
    public Optional<Order> getById(Integer id) {
        return userCRUD.findById(id);
    }
    
    public Order save(Order user) {
        return userCRUD.save(user);
    }
    
    public void delete(Integer id) {
        userCRUD.deleteById(id);
    }
    
}

