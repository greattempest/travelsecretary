package com.tempest.travelsecretary.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.travelsecretary.entity.Schedule;

public interface ScheduleRepo extends JpaRepository<Schedule, String>{
	public Page<Schedule> findByUserid(String userid, Pageable pageable);
	
	public Page<Schedule> findByTravelid(String travelid, Pageable pageable);
	
	public Page<Schedule> findByUseridAndTravelid(String userid,String travelid, Pageable pageable);

	public Page<Schedule> findByUseridAndStatus(String userid,String status, Pageable pageable);

	public Page<Schedule> findByTravelidAndStatus(String travelid, String status,Pageable pageable);
	
	public Page<Schedule> findByUseridAndTravelidAndStatus(String userid,String travelid,String status, Pageable pageable);

}
