package br.com.brito.hexagonal.application.ports.out;

import br.com.brito.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);
}
