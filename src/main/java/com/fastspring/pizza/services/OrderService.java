package com.fastspring.pizza.services;
import com.fastspring.pizza.data.repositories.OrderRepository;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Collection;
import com.fastspring.pizza.util.*;
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