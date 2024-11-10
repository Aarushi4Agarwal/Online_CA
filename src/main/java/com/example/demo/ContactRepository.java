package com.example.demo;

import com.example.demo.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
    // Additional query methods, if needed, can be added here
}