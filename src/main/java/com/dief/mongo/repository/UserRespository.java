package com.dief.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dief.mongo.domain.User;

@Repository
public interface UserRespository extends MongoRepository<User, String>{

}
