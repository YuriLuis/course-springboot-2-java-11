package com.yuriluis.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuriluis.course.entities.Product;
import com.yuriluis.course.repositories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	public Product save( Product product) {
		
		return repository.save(product);
	}
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
	}
}
