package com.fastspring.pizza.data.entities;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NotBlank(message = "Pizza name is required.")
    @Size(min = 2, max = 255, message = "Pizza name must be between 2 and 255 characters long.")
    private String name;
    
    @Column(name="IMAGE_URL", length = 2000)
    private String imageUrl;

    @Column(length = 2000)
    @Size(max = 2000, message = "Description cannot be longer than 2000 characters.")
    private String description;

    @Column(nullable = false)
    @NotNull(message = "Price is required.")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0.")
    private BigDecimal price; 
}
