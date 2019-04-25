package com.egbert.jpa.repository;

import com.egbert.jpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Address, Long> {
}