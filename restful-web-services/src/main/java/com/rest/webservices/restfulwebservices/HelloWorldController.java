package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET,path="hello")
	public String helloWorld() {
		return "Hi i am first API";
	}
}
