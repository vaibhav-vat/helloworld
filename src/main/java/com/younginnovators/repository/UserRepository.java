package com.younginnovators.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.younginnovators.entity.Complaint;
import com.younginnovators.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}