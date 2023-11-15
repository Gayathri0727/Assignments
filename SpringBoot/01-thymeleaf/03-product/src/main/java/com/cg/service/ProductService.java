package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Product;
import com.cg.productrepository.ProductRepository;
@Service
@Transactional

public class ProductService {
@Autowired
private ProductRepository repo;
public List<Product> listAll(){
	List<Product> products=repo.findAll();
	System.out.println(products);
	return products;
}
public void save(Product product) {
	repo.save(product);
}
public void delete(Long id) {
	repo.deleteById(id);
}
public Product get(Long id) {
	 
	return repo.findById(id).get();
}
}
