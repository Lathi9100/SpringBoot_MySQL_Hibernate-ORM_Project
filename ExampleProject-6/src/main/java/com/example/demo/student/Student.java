package com.example.demo.student;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
@Component
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String mail;
	private String address;
	
	Student(){
		super();
	}
	Student(long id, String name, String mail, String address){
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.address = address;
	}
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	public String getMail() {
		return mail;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
