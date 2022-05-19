package com.vinod.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.entity.Contact;
import com.vinod.repo.ContactRepository;
import com.vinod.service.IContactService;

@Service
public class ContactServiceImpl implements IContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "Success";
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContact(Integer cid) {
		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(Integer cid) {
		//repo.deleteById(cid);
		Optional<Contact> findById = repo.findById(cid);
		if(findById.isPresent()) {
			Contact contact=findById.get();
			contact.setActiveSw("N");
			repo.save(contact);
		}
		return "SUCCESS";
	}

}
