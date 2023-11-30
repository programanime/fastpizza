package com.fastspring.pizza.controllers;
import com.fastspring.pizza.data.dtos.OrderDTO;
import com.fastspring.pizza.data.entities.Order;
import com.fastspring.pizza.repositories.OrderRepository;
import com.fastspring.pizza.repositories.PizzaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.math.BigDecimal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderRepository orderRepository;
    private final PizzaRepository pizzaRepository;
    
    public OrderController(
        OrderRepository orderRepository,
        PizzaRepository pizzaRepository
    ) {
        this.orderRepository = orderRepository;
        this.pizzaRepository = pizzaRepository;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTourRating(@RequestBody @Validated OrderDTO orderDto) {
        this.orderRepository.save(
            new Order(
                null,
                this.pizzaRepository.findById(orderDto.getPizza()).orElseGet(null),
                new BigDecimal(orderDto.getPrice())
            )
        );
    }
}