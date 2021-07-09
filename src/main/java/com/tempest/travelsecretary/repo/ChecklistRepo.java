package com.tempest.travelsecretary.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.travelsecretary.entity.Checklist;

public interface ChecklistRepo extends JpaRepository<Checklist, String> {
	public Page<Checklist> findByUserid(String userid, Pageable pageable);
	
	public Page<Checklist> findByTravelid(String travelid, Pageable pageable);
	
	public Page<Checklist> findByUseridAndTravelid(String userid,String travelid, Pageable pageable);

	public Page<Checklist> findByTravelidAndStatus(String travelid, String status,Pageable pageable);
	
	public Page<Checklist> findByUseridAndTravelidAndStatus(String userid,String travelid,String status, Pageable pageable);
}
