package com.fastspring.pizza.controllers;
import com.fastspring.pizza.data.dtos.OrderDTO;
import com.fastspring.pizza.data.entities.Order;
import com.fastspring.pizza.repositories.OrderRepository;
import com.fastspring.pizza.repositories.PizzaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.fastspring.pizza.services.*;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collection;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

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