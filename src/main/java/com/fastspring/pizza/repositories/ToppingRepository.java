package com.fastspring.pizza.repositories;
import com.fastspring.pizza.data.entities.Topping;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends PagingAndSortingRepository<Topping, Integer> {
}
