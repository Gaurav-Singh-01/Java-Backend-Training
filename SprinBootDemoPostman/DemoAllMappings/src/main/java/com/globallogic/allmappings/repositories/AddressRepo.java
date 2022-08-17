package com.globallogic.allmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allmappings.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
