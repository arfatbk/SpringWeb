package com.arfat.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="firstname")
	private String FirstName;
	
	@Column(name="middlename")
	private String MiddleName;
	
	@Column(name="lastname")
	private String LastName;
	
	@Column(name="profilepic")
	private String pic;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="author")
	private List<Book> books = new ArrayList<>();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName
				+ "pic="+pic+ "description="+description+ "]";
	}

	public Author() {
		
	}
	public Author(String firstName, String middleName, String lastName,String pic,String description) {
		super();
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		this.pic = pic;
		this.description = description;
	}
	
	
	

}
