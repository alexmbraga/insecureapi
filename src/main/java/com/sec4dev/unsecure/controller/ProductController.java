package com.sec4dev.unsecure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.sec4dev.unsecure.model.Product;
import com.sec4dev.unsecure.service.ProductService;

@RestController 
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{pid}")
	public Product getProduct(@PathVariable("pid") String id){
		return productService.getProduct(id);
	}

	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/products/{pid}")
	public void updateProduct(@RequestBody Product product, @PathVariable("pid") String id) {
			productService.updateProduct(id, product);
	}
	
	@DeleteMapping("/products/{pid}")
	public void deleteProduct(@PathVariable("pid") String id) {
		productService.deleteProduct(id);
	}
}
