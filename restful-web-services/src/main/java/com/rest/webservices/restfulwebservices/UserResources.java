package com.rest.webservices.restfulwebservices;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResources {
	@Autowired
	private UserDaoService service;
	
	@GetMapping("users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	@GetMapping("users/{id}")
	public User retriveUser(@PathVariable int id){
		return service.findOne(id);
	}
	@PostMapping("users")
	public User saveUser(@RequestBody User user){
		return service.save(user);
	}
}
