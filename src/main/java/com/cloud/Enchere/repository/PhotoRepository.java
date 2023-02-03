package com.cloud.Enchere.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cloud.Enchere.model.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo,String> {
}