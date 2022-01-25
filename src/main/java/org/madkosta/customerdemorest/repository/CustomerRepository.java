package org.madkosta.customerdemorest.repository;

import org.madkosta.customerdemorest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
