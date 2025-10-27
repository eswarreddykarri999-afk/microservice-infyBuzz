package com.ibm.service;

import com.ibm.entity.Address;
import com.ibm.repository.AddressRepository;
import com.ibm.request.CreateAddressRequest;
import com.ibm.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setStreet(createAddressRequest.getStreet());
        address.setCity(createAddressRequest.getCity());

        addressRepository.save(address);

        return new AddressResponse(address);

    }

    public AddressResponse getById(long id) {
        Address address = addressRepository.findById(id).get();
        return new AddressResponse(address);
    }
}
