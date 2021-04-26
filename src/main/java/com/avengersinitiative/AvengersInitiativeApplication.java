package com.avengersinitiative;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvengersInitiativeApplication {   // implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(AvengersInitiativeApplication.class, args);
	}

}






/*
@Autowired
private ComplaintRepository complaintRepository; 	
@Override
public void run(String... args) throws Exception {
	
	Complaint complaint = new Complaint("Cleanliness","Not UpTo The Mark");
		
		Candidate user1 = new Candidate("john");
		Candidate user2 = new Candidate("harry");
		Candidate user3 = new Candidate("rohn");
		
   complaint.getUser().add(user1);
   complaint.getUser().add(user2);
   complaint.getUser().add(user3);
   
   this.complaintRepository.save(complaint);			
}
*/