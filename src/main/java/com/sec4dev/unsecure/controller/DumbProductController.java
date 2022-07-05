package com.sec4dev.unsecure.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.sec4dev.unsecure.model.Product;

@RestController 
public class DumbProductController {

	@GetMapping("/dumbproducts")
	public List<Product> getAllProducts(){
		return Arrays.asList(
				new Product("P101","Monitor" ,"Electronics"),
				new Product("P102","Blanket" ,"Household"),
				new Product("P103","Notebook","Electronics"),
				new Product("P104","T-shirt" ,"Fashion"),
				new Product("P105","Pencil"  ,"School")
				);
	}

}
