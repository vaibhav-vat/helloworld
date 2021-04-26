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
import com.younginnovators.entity.TrainInfo;
import com.younginnovators.repository.ComplaintRepository;
import com.younginnovators.repository.TrainInfoRepository;
import com.younginnovators.service.TrainInfoService;

@RestController
@RequestMapping("/trainInfo")
public class TrainInfoController 
{
	@Autowired
    private TrainInfoService trainInfoService;


    @GetMapping("/trainInfos")
    public List<TrainInfo> getTrainInfos() 
    {
        return trainInfoService.getTrainInfos();
    }
	@GetMapping("/trainInfo/{id}")
	public ResponseEntity < TrainInfo > getTrainInfoById(
	       @PathVariable(value = "id") Long trainInfoId) 
	{
		
	    return trainInfoService.getTrainInfoById(trainInfoId);
	}

	@PostMapping("/trainInfo/add")
    public TrainInfo createTrainInfo(@RequestBody TrainInfo trainInfo) 
	{
		
		return trainInfoService.createTrainInfo(trainInfo);
    }
}
