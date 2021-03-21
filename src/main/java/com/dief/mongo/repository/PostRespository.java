package com.dief.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dief.mongo.domain.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String>{

}
