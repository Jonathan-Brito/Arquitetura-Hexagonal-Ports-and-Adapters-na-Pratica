package br.com.brito.hexagonal.adapters.out.client.mapper;

import br.com.brito.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.brito.hexagonal.application.core.domain.Address;

public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
