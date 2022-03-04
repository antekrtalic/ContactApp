package com.ceki.demo.jsspringboot.dao;

import com.ceki.demo.jsspringboot.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
