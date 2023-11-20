package com.verinon.service;

import org.springframework.stereotype.Service;

import com.verinon.binding.Product;
import com.verinon.exception.NoProductFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProductById(Integer pid) {
		if (pid == 101) {
			return new Product("101", "keyboard", 500.00);
		} else {
			throw new NoProductFoundException("No Product Found");
		}

	}

}
