package com.younginnovators.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.younginnovators.entity.Complaint;
import com.younginnovators.repository.ComplaintRepository;

@Service
public class ComplaintService {
	@Autowired
    private ComplaintRepository complaintRepository;

    public List<Complaint> getComplaints() 
    {
        return complaintRepository.findAll();
    }

	public ResponseEntity < Complaint > getComplaintById(
	       @PathVariable(value = "id") Long complaintId) 
	{
		Complaint complaint = complaintRepository.findById(complaintId).get();
	    return ResponseEntity.ok().body(complaint);
	}

    public Complaint createComplaint(Complaint complaint) 
	{
	
		return complaintRepository.save(complaint);
    }
    
    public String deleteComplaint(Complaint complaint) 
	{
	
		complaintRepository.delete(complaint);;
		return "Deleted";
    }


}
