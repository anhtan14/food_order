package com.anhtan.foododering.repository;

import com.anhtan.foododering.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
