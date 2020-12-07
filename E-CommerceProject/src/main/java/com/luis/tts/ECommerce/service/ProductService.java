package com.luis.tts.ECommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.tts.ECommerce.model.Product;
import com.luis.tts.ECommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }	

}