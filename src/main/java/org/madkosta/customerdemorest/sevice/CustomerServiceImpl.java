package org.madkosta.customerdemorest.sevice;

import lombok.extern.slf4j.Slf4j;
import org.madkosta.customerdemorest.model.Customer;
import org.madkosta.customerdemorest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("In CustomerServiceImpl getById {}", id);
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("In CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("In CustomerServiceImpl delete {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("In CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
