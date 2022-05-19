package com.vinod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinod.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
