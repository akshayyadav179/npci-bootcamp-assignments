package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> product = productRepo.findById(id);
		Product productObject = null;
		
		if(product.isPresent())
			productObject = product.get();
		
		return productObject;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
		
	}

}
