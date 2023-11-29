package com.fastspring.pizza.data.entities;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import com.fastspring.pizza.data.enums.PizzaSize;
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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Pizza pizza;
    
    @ManyToOne
    private User user;
    
    @Column
    @Enumerated
    private PizzaSize size;
    
    @Column(nullable = false)
    @NotNull(message = "Price is required.")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0.")
    private BigDecimal price; 
}
