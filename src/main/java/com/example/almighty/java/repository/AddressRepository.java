package com.example.almighty.java.repository;

import com.example.almighty.java.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
