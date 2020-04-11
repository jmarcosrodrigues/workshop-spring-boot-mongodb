package com.joaomarcos.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.workshopmongo.domain.Post;
import com.joaomarcos.workshopmongo.repository.PostRepository;
import com.joaomarcos.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		//List<Post> posts = repository.findByTitleContainingIgnoreCase(text);
		return repository.searchTitle(text);
	}
	
	
	


}
