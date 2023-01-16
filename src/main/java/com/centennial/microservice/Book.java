package com.centennial.microservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="bookid")
	private int bookid;
	@Column(name="title")
	private String title;
	@Column(name="authorlastname")
	private String authorlastname;
	@Column(name="authorfirstname")
	private String authorfirstname;
	@Column(name="rating")
	private String rating;
	
	public Book() {
		super();
	}
	public Book(int bookid, String title, String authorlastname, String authorfirstname, String rating) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.authorlastname = authorlastname;
		this.authorfirstname = authorfirstname;
		this.rating=rating;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorlastname() {
		return authorlastname;
	}
	public void setAuthorlastname(String authorlastname) {
		this.authorlastname = authorlastname;
	}
	public String getAuthorfirstname() {
		return authorfirstname;
	}
	public void setAuthorfirstname(String authorfirstname) {
		this.authorfirstname = authorfirstname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}