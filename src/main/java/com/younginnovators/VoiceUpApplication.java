package com.younginnovators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.younginnovators.entity.Complaint;
import com.younginnovators.entity.User;
import com.younginnovators.repository.ComplaintRepository;

@SpringBootApplication
public class VoiceUpApplication {   // implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(VoiceUpApplication.class, args);
	}
/*
	@Autowired
	private ComplaintRepository complaintRepository; 	
	@Override
	public void run(String... args) throws Exception {
		
		Complaint complaint = new Complaint("Cleanliness","Not UpTo The Mark");
			
			User user1 = new User("john");
			User user2 = new User("harry");
			User user3 = new User("rohn");
			
	   complaint.getUser().add(user1);
	   complaint.getUser().add(user2);
	   complaint.getUser().add(user3);
	   
	   this.complaintRepository.save(complaint);			
	}
*/
}
