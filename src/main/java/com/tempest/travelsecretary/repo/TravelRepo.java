package com.tempest.travelsecretary.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.travelsecretary.entity.Travel;

public interface TravelRepo extends JpaRepository<Travel, String>{
	public Page<Travel> findByUserid(String userid, Pageable pageable);
		
	public Page<Travel> findByUseridAndStatus(String userid, String status,Pageable pageable);
	
	public Page<Travel> findByUseridAndTitleContainingAndStatus(String travelid, 
			String title , String status, Pageable pageable);
}
