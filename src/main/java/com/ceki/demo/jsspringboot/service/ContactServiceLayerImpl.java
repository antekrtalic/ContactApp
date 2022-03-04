package com.ceki.demo.jsspringboot.service;

import com.ceki.demo.jsspringboot.dao.ContactRepository;
import com.ceki.demo.jsspringboot.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceLayerImpl implements ContactServiceLayer {

    private ContactRepository contactRepository;

    @Autowired
    public ContactServiceLayerImpl(ContactRepository theContactRepository) {
        contactRepository = theContactRepository;
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact addContact(Contact theContact) {

        contactRepository.save(theContact);

        return theContact;
    }
}
