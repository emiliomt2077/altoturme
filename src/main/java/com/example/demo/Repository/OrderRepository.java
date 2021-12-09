/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Models.Order;
import com.example.demo.Repository.CRUD.OrderCRUD;
import java.util.Date;
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
    
    public List<Order> getAllBySalesman(Integer id) {
        return orderCRUD.findAllBySalesManId(id);
    } 
    
    public List<Order> getAllByRegisterDayAndSalesmanId(Date registerDay, Integer id) {
        return orderCRUD.findAllByRegisterDayAndSalesManId(registerDay, id);
    }
    
    public List<Order> getAllByStatusAndSalesmanId(String status, Integer id) {
        return orderCRUD.findAllByStatusAndSalesManId(status, id);
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

