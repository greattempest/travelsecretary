package com.tempest.travelsecretary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tempest.shiro.ShiroUser;

public interface UserRepo extends JpaRepository<ShiroUser, String>{
	
	public ShiroUser findByUsername(String username);
	
}
