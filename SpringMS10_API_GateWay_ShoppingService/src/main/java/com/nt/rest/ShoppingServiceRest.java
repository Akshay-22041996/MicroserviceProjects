package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceRest {

	@GetMapping("/show")
	public String showShoppingMsg() {
		return "Shopping Rest is executed";
	}
}
