package com.example.eApproveSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eApproveSystem.entity.Pending;

public interface PendingRepository extends JpaRepository<Pending, Integer>{
	
}
