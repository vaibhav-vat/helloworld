package com.avengersinitiative.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avengersinitiative.entity.Candidate;
import com.avengersinitiative.repository.AvengersInitiativeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.qainnovation.utils.ElasticSearchUtils;

@Service
public class AvengersInitiativeService {
	
	@Autowired
    private AvengersInitiativeRepository avengersInitiativeRepository;


    public List<Candidate> getAllCandidatesList() 
    {
    	
        return addDateAndTotalToDbAndElk();
    }
	

    public Candidate saveCandidate( Candidate candidate) 
	{
		return avengersInitiativeRepository.save(candidate);
    }
	
	
	
	public List<Candidate> addDateAndTotalToDbAndElk() 
	{
		ElasticSearchUtils elasticSearchUtils = new ElasticSearchUtils();
		List<Candidate>  studentList = avengersInitiativeRepository.findAll();
		
		try {
			elasticSearchUtils.createIndex("avengers-initiative");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for (Candidate candidate : studentList) 
		{
			
			// Make Total
			//candidate.setTotal(candidate.getAntSuitHandle()+candidate.getIronSuitHandle()+candidate.getMjollnirHandle()+candidate.getShieldHandle());
			
			//Set Record Date To Current Date In Kibana Format
//			Date date = new Date();
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//			candidate.setRecordDate(formatter.format(date));
//			candidate.setBatch("1");
//			
//			avengersInitiativeRepository.save(candidate);
			try {
				elasticSearchUtils.ingestDataToIndex("avengers-initiative", new Gson().toJson(candidate));
			} catch (IOException e) {
			}
			
		}
		return studentList;
	}

	
	
}



/*
 
 public ResponseEntity < Candidate > getUserById(Long userId) 
	{
	    	Candidate user = avengersInitiativeRepository.findById(userId).get();
	        return ResponseEntity.ok().body(user);
	}
	
	
	public String LoginUser(String email, String password) {
		//Candidate user = new Candidate();
		//avengersInitiativeRepository.findOne(user);
		
		List<Candidate>  users = avengersInitiativeRepository.findAll();
		for (Candidate user : users) 
		{
			if(true)//user.getEmailId() != null &&  user.getEmailId().equals(email))
			{
				if(true)//user.getPassword() != null && user.getPassword().equals(password))
				{
					return "Candidate Exists";
				}
			
			}
		
		}
		return "Wrong Username";
	}
 
 * */
