package com.arfat.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arfat.Models.Author;
import com.arfat.Repository.UserRepository;

@Service
public class AuthorService {

	@Autowired
	private UserRepository userRepository;
	
	public Iterable<Author> getAllusers() {
		return userRepository.findAll();
	}
	
	public Optional<Author> getOne(long id) {
		return userRepository.findById(id);
	}
}
