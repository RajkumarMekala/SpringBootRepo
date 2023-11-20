package com.verinon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verinon.binding.Product;
import com.verinon.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	/*
	 * @GetMapping(value = "getProduct", produces = { "application/json" }) public
	 * Product getProductDataById(@RequestParam(value = "pid", required = false)
	 * String pid) {
	 * 
	 * return productService.getProductById(Integer.parseInt(pid)); }
	 */
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable String pid) {
		return productService.getProductById(Integer.parseInt(pid));

	}

}
