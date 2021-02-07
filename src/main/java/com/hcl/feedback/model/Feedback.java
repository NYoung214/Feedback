package com.hcl.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	private long Id;
	private String name;
	private int rating;
	private String comment;
	
	public Feedback() {
		super();
	}
	
	public Feedback(long id, String name, int rating, String comment) {
		super();
		Id = id;
		this.name = name;
		this.rating = rating;
		this.comment = comment;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
