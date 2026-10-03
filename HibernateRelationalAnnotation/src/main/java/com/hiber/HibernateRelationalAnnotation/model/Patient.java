package com.hiber.HibernateRelationalAnnotation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	
	@Id
	private int pid;
	private String name;
	private String email;
	
	@OneToOne
	private Doctor d;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", email=" + email + ", d=" + d + "]";
	}
	
	

}
