package com.example.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.dto.ProductRequest;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void crearProducto(@RequestBody ProductRequest productRequest) {
		
	}
}
