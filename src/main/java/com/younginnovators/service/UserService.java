package com.younginnovators.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.younginnovators.entity.Complaint;
import com.younginnovators.entity.TrainInfo;
import com.younginnovators.entity.User;
import com.younginnovators.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() 
    {
        return userRepository.findAll();
    }
	public ResponseEntity < User > getUserById(Long userId) 
	{
	    	User user = userRepository.findById(userId).get();
	        return ResponseEntity.ok().body(user);
	}

    public User createUser( User user) 
	{
		return userRepository.save(user);
    }
	public String LoginUser(String email, String password) {
		//User user = new User();
		//userRepository.findOne(user);
		
		List<User>  users = userRepository.findAll();
		for (User user : users) 
		{
			if(user.getEmailId() != null &&  user.getEmailId().equals(email))
			{
				if(user.getPassword() != null && user.getPassword().equals(password))
				{
					return "User Exists";
				}
				else
				{
					return "Wrong Details";
				}
			}
		
		}
		return "Wrong Username";
	}

}
