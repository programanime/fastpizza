package com.fastspring.pizza.repositories;
import com.fastspring.pizza.data.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    boolean existsByEmail(String email);
}
