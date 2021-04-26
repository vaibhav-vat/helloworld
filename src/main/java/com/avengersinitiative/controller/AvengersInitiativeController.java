package com.avengersinitiative.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avengersinitiative.entity.Candidate;
import com.avengersinitiative.service.AvengersInitiativeService;


@RestController
@RequestMapping("/av")
public class AvengersInitiativeController 
{
	@Autowired
    private AvengersInitiativeService avengersInitiativeService;


    @GetMapping("/getAllCandidatesList")
    public List<Candidate> getAllCandidatesList() 
    {
    	return avengersInitiativeService.getAllCandidatesList();
    }

	@GetMapping("/hello")
    public String hello() 
    {
    	return "hello";
    }

	
}












/*
 @GetMapping("/user/{id}")
	public ResponseEntity < Candidate > getUserById(
	       @PathVariable(value = "id") Long userId) 
	{
	    	return avengersInitiativeService.getUserById(userId);
	}

	@PostMapping("/user/add")
    public Candidate createUser(@RequestBody Candidate user) 
	{
		return avengersInitiativeService.createUser(user);
    }
	
	//Login
		@PostMapping("/user/login")
	    public String LoginUser(@RequestBody Candidate user) 
		{
			
			return null; //avengersInitiativeService.LoginUser(user.getEmailId(),user.getPassword());
	    }
	
	
	//Login
	@PostMapping("/user/log")
    public String LogUser(@RequestBody String emailId,@RequestBody String password) 
	{
		return avengersInitiativeService.LoginUser(emailId,password);
    } 
 
 */