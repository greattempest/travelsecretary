package com.tempest.travelsecretary.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.travelsecretary.entity.Traffice;

public interface TrafficeRepo extends JpaRepository<Traffice, String>{
	public Page<Traffice> findByScheduleid(String scheduleid, Pageable pageable);
	
	public Page<Traffice> findByScheduleidAndStatus(String scheduleid,String status, Pageable pageable);


}
