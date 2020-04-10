package com.joaomarcos.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.workshopmongo.domain.User;
import com.joaomarcos.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public List<User> findAll() {
	   return repository.findAll();	
	}

}
