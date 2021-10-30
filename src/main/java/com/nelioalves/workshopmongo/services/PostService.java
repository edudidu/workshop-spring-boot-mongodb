package com.nelioalves.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.PostRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired //Instancia automaticamente
	private PostRepository repo;

	public List<Post> fundAll(){
		return repo.findAll();
	}
	
	public Post findById(String id) {
		Post post = repo.findById(id).orElse(null);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		
		return post;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);//repo.findByTitleContainingIgnoreCase(text);
	}
	
}
