package com.fastspring.pizza.data.entities;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Enumerated;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
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
