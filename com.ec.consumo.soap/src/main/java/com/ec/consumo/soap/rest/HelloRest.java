package com.ec.consumo.soap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloRest {
	
	@GetMapping
	public String helloTest() {
		return "Hola mundo cruel";
	}

}
