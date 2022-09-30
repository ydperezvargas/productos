package com.example.productservice.service;

import org.springframework.stereotype.Service;

import com.example.productservice.dto.ProductRequest;
import com.example.productservice.model.Producto;
import com.example.productservice.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductoService {
	private final ProductoRepository productoRepository;

	public void crearProducto(ProductRequest productRequest) {
		Producto producto= Producto.builder()
				.name(productRequest.getName())
				.descripcion(productRequest.getDescripcion())
				.precio(productRequest.getPrecio())
				.build();
		productoRepository.save(producto);
		log.info("Product is saved"+producto.getId());

	}			
	
}
