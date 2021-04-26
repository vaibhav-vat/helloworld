package com.younginnovators.controller;

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
import com.younginnovators.entity.User;
import com.younginnovators.repository.ComplaintRepository;
import com.younginnovators.repository.UserRepository;
import com.younginnovators.service.ComplaintService;


@RestController
@RequestMapping("/complaint")
public class ComplaintController 
{
	@Autowired
    private ComplaintService complaintService;


    @GetMapping("/complaints")
    public List<Complaint> getComplaints() 
    {
        return complaintService.getComplaints();
    }
	@GetMapping("/complaint/{id}")
	public ResponseEntity < Complaint > getComplaintById(
	       @PathVariable(value = "id") Long complaintId) 
	{
		
	    return complaintService.getComplaintById(complaintId);
	}

	@PostMapping("/complaint/add")
    public Complaint createComplaint(@RequestBody Complaint complaint) 
	{
		
		return complaintService.createComplaint(complaint);
    }
}
