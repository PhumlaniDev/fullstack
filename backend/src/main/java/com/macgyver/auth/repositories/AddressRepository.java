package com.macgyver.auth.repositories;

import com.macgyver.auth.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
