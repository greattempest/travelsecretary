package com.tempest.travelsecretary.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Travel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String userid;
	
	private String title;
	
	private String thedesc;
	
	private String days;
	
	private Date startday;
	
	private Date enddays;
	
	private String status;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThedesc() {
		return thedesc;
	}

	public void setThedesc(String thedesc) {
		this.thedesc = thedesc;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public Date getEnddays() {
		return enddays;
	}

	public void setEnddays(Date enddays) {
		this.enddays = enddays;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
