package com.danielspring.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danielspring.app.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
