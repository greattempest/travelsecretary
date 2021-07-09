package com.tempest.travelsecretary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Traffice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String scheduleid;
	
	private String thedesc;
	
	private String picture;
	
	private String status;
	
	private String shift;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}

	public String getThedesc() {
		return thedesc;
	}

	public void setThedesc(String thedesc) {
		this.thedesc = thedesc;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
}
