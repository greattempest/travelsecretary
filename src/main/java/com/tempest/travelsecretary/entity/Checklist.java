package com.tempest.travelsecretary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Checklist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String userid;
	
	private String travelid;
	
	private String status;
	
	private String isdefualt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTravelid() {
		return travelid;
	}

	public void setTravelid(String travelid) {
		this.travelid = travelid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsdefualt() {
		return isdefualt;
	}

	public void setIsdefualt(String isdefualt) {
		this.isdefualt = isdefualt;
	}
	
	
}
