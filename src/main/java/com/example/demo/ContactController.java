package com.example.demo;

import com.example.demo.ContactEntity;
import com.example.demo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // Add a new contact
    @PostMapping("/add")
    public ContactEntity addContact(@RequestBody ContactEntity contact) {
        return contactRepository.save(contact);
    }

    // Retrieve all contacts
    @GetMapping("/all")
    public List<ContactEntity> getAllContacts() {
        return contactRepository.findAll();
    }
}