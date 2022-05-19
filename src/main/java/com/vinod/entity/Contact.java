package com.vinod.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CONTACT_DTLS")
@Data
public class Contact {
    @Id
    @GeneratedValue
	private Integer cid;
	private String name;
	private String email;
	private Long phno;
	private String activeSw;
}
