package com.fastspring.pizza.data.entities;
import javax.validation.constraints.Email;
import com.fastspring.pizza.data.enums.UserType;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import lombok.Data;
import javax.persistence.Entity;

@Entity(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String username;
    
    @Column
    @Email(message = "please provide a valid email")
    private String email;
    
    @Column
    private String password;
    
    @Column
    @Enumerated
    private UserType type;
}
