package com.joaomarcos.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.workshopmongo.domain.User;
import com.joaomarcos.workshopmongo.dto.UserDTO;
import com.joaomarcos.workshopmongo.repository.UserRepository;
import com.joaomarcos.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public User FromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

}
