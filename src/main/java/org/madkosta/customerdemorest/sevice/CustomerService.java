package org.madkosta.customerdemorest.sevice;

import org.madkosta.customerdemorest.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Long id);
    void save(Customer customer);
    void delete(Long id);
    List<Customer> getAll();
}
