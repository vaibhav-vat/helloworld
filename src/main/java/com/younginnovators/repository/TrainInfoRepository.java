package com.younginnovators.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.younginnovators.entity.Complaint;
import com.younginnovators.entity.TrainInfo;

@Repository
public interface TrainInfoRepository extends JpaRepository<TrainInfo, Long> {

}
