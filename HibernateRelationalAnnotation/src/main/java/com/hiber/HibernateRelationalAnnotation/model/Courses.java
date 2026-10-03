package com.hiber.HibernateRelationalAnnotation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	private int id;
	private String courseName;
	
	@ManyToMany
	private List<Students> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Students> getList() {
		return list;
	}

	public void setList(List<Students> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", list=" + list + "]";
	}
	
	
	
}
