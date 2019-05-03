package com.arfat.Controllers;

import java.util.Optional;

import com.arfat.Models.Book;
import com.arfat.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arfat.Models.Author;
import com.arfat.Service.AuthorService;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private AuthorService userService;
	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public ModelAndView getBooks(){
		ModelAndView m = new ModelAndView("index");
		Iterable<Book> books = bookService.getAllBooks();
		m.addObject("books",books);
		return m;
	}
	@RequestMapping("/authors")
	public String getAuthors(Model m) {

		Iterable<Author> users = userService.getAllusers();

		for (Author u : users)
			System.out.println(u);
		m.addAttribute("users", users);
		return "authors";
	}

	@RequestMapping("/authorDetails/{path:[0-9]*}")
	public String getUserDetails(@PathVariable String path, Model m) {

		Optional<Author> u = userService.getOne(Long.parseLong(path));
		try {
			Author user = u.get();
			m.addAttribute("user", user);
			return "authorInfo";
		}catch(Exception e) {		
			return "404";
		}
	}

	@RequestMapping("/bookDetails/{path:[0-9]*}")
	public ModelAndView getBookDetails(@PathVariable String path) {

		ModelAndView m = new ModelAndView("bookDetails");
		Optional<Book> b = bookService.getOne(Long.parseLong(path));
		try {
			Book book = b.get();
			m.addObject("book", book);
			m.addObject("title","Book Details");
			return m;
		}catch(Exception e) {
			return new ModelAndView("404");
		}
	}

}
