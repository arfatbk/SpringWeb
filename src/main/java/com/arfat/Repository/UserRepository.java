package com.arfat.Repository;

import org.springframework.data.repository.CrudRepository;

import com.arfat.Models.Author;

public interface UserRepository extends CrudRepository<Author, Long> {

}
