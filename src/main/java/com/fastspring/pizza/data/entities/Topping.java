package com.fastspring.pizza.data.entities;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import lombok.Data;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column(length = 2000)
    private String description;

    @Column
    private BigDecimal price;
}
