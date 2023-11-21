package com.verinon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verinon.output.PostOfficeResponseBean;
import com.verinon.service.PostOfficeService;

@RestController
public class PostOfficeController {
	@Autowired
	private PostOfficeService postOfficeService;

	@GetMapping(value = "/getByCity", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean getPostalByCity(@RequestParam String city) {
		PostOfficeResponseBean postOfficeByCity = postOfficeService.getPostOfficeByCity(city);
		return postOfficeByCity;

	}

}
