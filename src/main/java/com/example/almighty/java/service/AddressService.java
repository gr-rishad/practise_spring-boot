package com.example.almighty.java.service;

import com.example.almighty.java.model.Address;
import com.example.almighty.java.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAll(){
        return addressRepository.findAll();
    }

    public Address saveOrUpdate(Address address){
        return addressRepository.save(address);
    }

    public Optional<Address> findById(Long id){
        return addressRepository.findById(id);
    }

    public String deleteById(Long id){
         addressRepository.deleteById(id);
        return "{'message ': 'Address Deleted Successfully.'}";
    }


}
