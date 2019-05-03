package com.arfat.Service;

import com.arfat.Models.Book;
import com.arfat.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getOne(long id) {
		return bookRepository.findById(id);
	}
}
