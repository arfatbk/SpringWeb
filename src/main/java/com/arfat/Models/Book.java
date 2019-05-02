package com.arfat.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="descreption")
	private String descreption;
	
	@Column(name="profilepic")
	private String profilepic;
	
	@ManyToOne
	private Author author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}

	public Book() {
		
	}


	public Book(String title, Double price, String descreption, String profilepic) {
		super();
		this.title = title;
		this.price = price;
		this.descreption = descreption;
		this.profilepic = profilepic;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", descreption=" + descreption + ", author="
				+ author + "]";
	}
	
	
}
