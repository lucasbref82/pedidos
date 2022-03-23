package br.com.pedidos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedidos.domain.entity.Users;
import br.com.pedidos.repositories.UserRepository;


@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		List<Users> users = repository.findAll();
		return users;
	}
	
	
	public Optional<Users> findById(Long id) {
		Optional<Users> user = repository.findById(id);
		return user;
	}
}
