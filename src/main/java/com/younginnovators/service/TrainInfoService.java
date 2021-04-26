package com.younginnovators.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.younginnovators.entity.TrainInfo;
import com.younginnovators.repository.TrainInfoRepository;

@Service
public class TrainInfoService {
	@Autowired
    private TrainInfoRepository trainInfoRepository;


    public List<TrainInfo> getTrainInfos() 
    {
        return trainInfoRepository.findAll();
    }

	public ResponseEntity < TrainInfo >getTrainInfoById(Long trainInfoId) 
	{
		TrainInfo trainInfo = trainInfoRepository.findById(trainInfoId).get();
	    return ResponseEntity.ok().body(trainInfo);
	}

    public TrainInfo createTrainInfo(TrainInfo trainInfo) 
	{
		return trainInfoRepository.save(trainInfo);
    }

}
