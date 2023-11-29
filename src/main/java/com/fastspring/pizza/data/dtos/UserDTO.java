package com.fastspring.pizza.data.dtos;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class UserDTO {
    private String username;
    private String password;
}