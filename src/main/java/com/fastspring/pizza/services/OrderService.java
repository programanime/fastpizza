package com.fastspring.pizza.services;
import com.fastspring.pizza.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    
    OrderService(
        OrderRepository orderRepository
    ){
        this.orderRepository = orderRepository;
    }
}