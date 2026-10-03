package com.hiber.HibernateRelationalAnnotation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String phone;
	
	@ManyToMany
	private List<Courses> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Courses> getList() {
		return list;
	}

	public void setList(List<Courses> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", list=" + list
				+ "]";
	}
	
	

}
