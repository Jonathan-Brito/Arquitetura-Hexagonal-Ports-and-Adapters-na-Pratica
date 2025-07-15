package br.com.brito.hexagonal.adapters.out;

import br.com.brito.hexagonal.adapters.out.repository.CustomerRepository;
import br.com.brito.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.brito.hexagonal.application.core.domain.Customer;
import br.com.brito.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
