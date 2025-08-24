package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
