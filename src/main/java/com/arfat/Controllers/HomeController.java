package com.arfat.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arfat.Models.Author;
import com.arfat.Service.AuthorService;

@Controller
public class HomeController {

	@Autowired
	private AuthorService userService;

	@RequestMapping("/")
	public String greet(Model m) {

		Iterable<Author> users = userService.getAllusers();

		for (Author u : users)
			System.out.println(u);
		m.addAttribute("users", users);
		return "index";
	}

	@PostMapping("/allusers")
	public String sayHi(@RequestParam String name, Model m) {

		return "greet";
	}

	@RequestMapping("/userDetails/{path:[0-9]*}")
	public String getUserDetails(@PathVariable String path, Model m) {

		Optional<Author> u = userService.getOne(Long.parseLong(path));
		try {
			Author user = u.get();
			m.addAttribute("user", user);
			return "userinfo";
		}catch(Exception e) {		
			return "404";
		}
	}

}
