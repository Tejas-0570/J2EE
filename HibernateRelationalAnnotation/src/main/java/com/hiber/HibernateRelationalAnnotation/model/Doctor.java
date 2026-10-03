package com.hiber.HibernateRelationalAnnotation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Doctor {
	
	@Id
	private int did;
	private String name;
	private String email;
	private String designation;
	
	@OneToOne
	private Patient p;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", email=" + email + ", designation=" + designation + ", p="
				+ p + "]";
	}
	
	
}
