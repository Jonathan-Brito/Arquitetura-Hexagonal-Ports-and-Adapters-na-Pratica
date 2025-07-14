package br.com.brito.hexagonal.application.ports.out;

import br.com.brito.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
