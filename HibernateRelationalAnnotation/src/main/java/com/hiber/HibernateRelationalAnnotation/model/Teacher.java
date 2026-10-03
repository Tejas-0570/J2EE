package com.hiber.HibernateRelationalAnnotation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.hiber.HibernateRelationalAnnotation.PlainClass.Address;

@Entity
public class Teacher {
	
	@Id
	private int tid;
	private String tname;
	private String temail;
	private String tphone;
	
	private Address a;
	
	@OneToMany
	List<Student> studList;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTphone() {
		return tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", temail=" + temail + ", tphone=" + tphone + ", a=" + a
				+ ", studList=" + studList + "]";
	}
	
	

}
