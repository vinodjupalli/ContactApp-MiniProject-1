package com.vinod.service;

import java.util.List;

import com.vinod.entity.Contact;

public interface IContactService {

	String upsert(Contact contact);

	List<Contact> getAllContacts();

	Contact getContact(Integer cid);

	String deleteContact(Integer cid);

}
