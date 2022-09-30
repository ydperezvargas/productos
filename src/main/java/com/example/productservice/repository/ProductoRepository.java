package com.example.productservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.productservice.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String>{

}
