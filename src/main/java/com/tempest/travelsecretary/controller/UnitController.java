package com.tempest.travelsecretary.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.tempest.shiro.ShiroUser;
import com.tempest.travelsecretary.repo.ChecklistRepo;
import com.tempest.travelsecretary.repo.UserRepo;

@RestController
@RequestMapping("unit")
public class UnitController {
	
	@Autowired
	private ChecklistRepo repo;
	
	@Autowired
	private UserRepo userRepo;

	@RequestMapping(value = "/find", method = RequestMethod.GET)
    public String refresh(HttpServletRequest request, ModelMap map) {
		try {
			Pageable page = PageRequest.of(0, 10);
			String text =JSON.toJSONString(repo.findByUserid("1",page));
			return text;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "ERROR";
	}
	
	@GetMapping(path = "/add")
	public void addNewUser(@RequestParam String name,@RequestParam String email) {
		ShiroUser n = new ShiroUser();
		//n.setUsername(name);
		//n.setEmail(email);
		userRepo.save(n);
		
	}
	
	@GetMapping(path = "/all")
	@ResponseBody
	public Iterable<ShiroUser> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping(path = "/info")
	@ResponseBody
	public Optional<ShiroUser> findOne(@RequestParam String id) {
		 return userRepo.findById(id);
	}
	
	@GetMapping(path = "/delete")
	public void delete(@RequestParam String id) {
		userRepo.deleteById(id);
	}
}
