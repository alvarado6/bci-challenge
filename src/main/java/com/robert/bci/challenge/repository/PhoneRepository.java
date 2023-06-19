package com.robert.bci.challenge.repository;

import com.robert.bci.challenge.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {
}
