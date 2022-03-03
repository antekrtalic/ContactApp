package com.ceki.demo.jsspringboot.service;

import com.ceki.demo.jsspringboot.entity.Contact;

import java.util.List;

public interface ContactServiceLayer {

    public List<Contact> getContacts();

    public Contact addContact(Contact theContact);
}
