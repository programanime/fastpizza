package com.fastspring.pizza.services;
import com.fastspring.pizza.data.repositories.UserRepository;
import com.fastspring.pizza.data.entities.User;
import com.fastspring.pizza.data.enums.UserType;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Collection;
import com.fastspring.pizza.util.*;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    UserService(
        UserRepository userRepository
    ){
        this.userRepository = userRepository;
    }
    
    public void signupAdmin(String username, String email, String password) {
        this.userRepository.save(new User(
            null,
            username,
            email,
            BCrypt.hashpw(password, BCrypt.gensalt()),
            UserType.ADMIN
        ));
    }
    
    public void signup(String username, String email, String password) {
        if(!this.userRepository.existsByEmail(email)) {
            this.userRepository.save(new User(
                null,
                username,
                email,
                BCrypt.hashpw(password, BCrypt.gensalt()),
                UserType.USER
            ));
        }
    }
}