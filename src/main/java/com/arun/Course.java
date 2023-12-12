package com.arun;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course 
{
	@Id
	private Integer id;
	
	private String cname;
	
	public Course()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Course(Integer id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + "]";
	}
	
}
