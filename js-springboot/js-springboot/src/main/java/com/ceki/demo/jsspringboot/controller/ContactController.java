package com.ceki.demo.jsspringboot.controller;

import com.ceki.demo.jsspringboot.entity.Contact;
import com.ceki.demo.jsspringboot.service.ContactServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/")
public class ContactController {

    private ContactServiceLayer contactServiceLayer;

    @Autowired
    public ContactController(ContactServiceLayer theContactServiceLayer) {
        contactServiceLayer = theContactServiceLayer;
    }

    @GetMapping("get_all")
    public List<Contact> getContacts() {
        return contactServiceLayer.getContacts();
    }

    @PostMapping("add")
    public Contact add(@RequestBody Contact theContact) {
        contactServiceLayer.addContact(theContact);

        return theContact;
    }
}
