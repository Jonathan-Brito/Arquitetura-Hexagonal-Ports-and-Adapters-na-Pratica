package br.com.brito.hexagonal.application.ports.in;

import br.com.brito.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
