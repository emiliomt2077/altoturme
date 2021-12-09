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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author unPandicornio
 */
@Repository
public class OrderRepository {
    @Autowired
    private OrderCRUD orderCRUD ;
    
    public List<Order> getAll() {
        return orderCRUD.findAll();
    }
    
    public List<Order> getAllByZone(String zone) {
        return orderCRUD.findAllBySalesManZone(zone);
    }
    
    public Optional<Order> getById(Integer id) {
        return orderCRUD.findById(id);
    }
    
    public Order save(Order order) {
        return orderCRUD.save(order);
    }
    
    public void delete(Integer id) {
        orderCRUD.deleteById(id);
    }
    
}

