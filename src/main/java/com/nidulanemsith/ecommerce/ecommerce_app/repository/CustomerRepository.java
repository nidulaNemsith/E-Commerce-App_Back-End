package com.nidulanemsith.ecommerce.ecommerce_app.repository;

import com.nidulanemsith.ecommerce.ecommerce_app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}
