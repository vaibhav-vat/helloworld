package com.younginnovators.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.younginnovators.entity.Complaint;
import com.younginnovators.entity.TrainInfo;
import com.younginnovators.entity.User;
import com.younginnovators.repository.TrainInfoRepository;
import com.younginnovators.repository.UserRepository;
import com.younginnovators.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
    private UserService userService;


    @GetMapping("/AllUsers")
    public List<User> getAllUsers() 
    {
        return userService.getAllUsers();
    }
	@GetMapping("/user/{id}")
	public ResponseEntity < User > getUserById(
	       @PathVariable(value = "id") Long userId) 
	{
	    	return userService.getUserById(userId);
	}

	@PostMapping("/user/add")
    public User createUser(@RequestBody User user) 
	{
		return userService.createUser(user);
    }
	
	//Login
		@PostMapping("/user/login")
	    public String LoginUser(@RequestBody User user) 
		{
			
			return userService.LoginUser(user.getEmailId(),user.getPassword());
	    }
	
	
	//Login
	@PostMapping("/user/log")
    public String LogUser(@RequestBody String emailId,@RequestBody String password) 
	{
		return userService.LoginUser(emailId,password);
    }
}
