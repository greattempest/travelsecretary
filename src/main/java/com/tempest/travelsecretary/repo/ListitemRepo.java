package com.tempest.travelsecretary.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.travelsecretary.entity.Listitem;

public interface ListitemRepo extends JpaRepository<Listitem, String> {
	public Page<Listitem> findByListid(String listid, Pageable pageable);
	
	public Page<Listitem> findByListidAndStatus(String listid, String status,Pageable pageable);
	
}
