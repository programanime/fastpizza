package com.fastspring.pizza.data.repositories;
import com.fastspring.pizza.data.entities.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    boolean existsByEmail(String email);
}
