package com.fastspring.pizza.data.entities;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import lombok.Data;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Addition {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Order order;
    
    @ManyToOne
    private User user;
    
    @ManyToOne
    private Topping topping;
    
    @Column
    private Integer quantity;
}
