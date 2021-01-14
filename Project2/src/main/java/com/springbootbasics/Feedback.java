package com.springbootbasics;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "feedback")
public class Feedback {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String text;
	public String getText() {
		return text;
	}
	public void setText(String name) {
		this.text = name;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", text=" + text + "]";
	}
	
}
	