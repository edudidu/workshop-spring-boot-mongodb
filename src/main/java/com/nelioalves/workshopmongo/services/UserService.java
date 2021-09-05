package com.nelioalves.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired //Instancia automaticamente
	private UserRepository repo;

	public List<User> fundAll(){
		return repo.findAll();
	}
	
}
