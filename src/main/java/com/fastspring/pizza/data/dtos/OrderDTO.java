package com.fastspring.pizza.data.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDTO {
    private String pizza;
    private Double price;
}