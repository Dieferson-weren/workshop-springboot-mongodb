package com.dief.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dief.mongo.domain.User;
import com.dief.mongo.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}