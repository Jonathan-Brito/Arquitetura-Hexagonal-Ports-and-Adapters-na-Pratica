package br.com.brito.hexagonal.adapters.out.repository.mapper;

import br.com.brito.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.brito.hexagonal.application.core.domain.Customer;

public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
