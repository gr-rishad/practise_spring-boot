package com.example.almighty.java.controller;

import com.example.almighty.java.model.Address;
import com.example.almighty.java.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/save")
    public Address save(@RequestBody Address address){
        return addressService.saveOrUpdate(address);
    }

    @GetMapping("/findById/{id}")
    public Optional<Address> findById(@PathVariable("id") Long id){
        return addressService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return addressService.deleteById(id);
    }
}
