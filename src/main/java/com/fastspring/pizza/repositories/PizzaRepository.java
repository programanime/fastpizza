package com.fastspring.pizza.repositories;
import com.fastspring.pizza.data.entities.Pizza;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
