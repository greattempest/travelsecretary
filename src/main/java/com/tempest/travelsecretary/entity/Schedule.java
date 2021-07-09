package com.tempest.travelsecretary.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String userid;
	
	private String travelid;
	
	private Date scheduleday;
	
	private String starttime;
	
	private String endtime;
	
	private String title;
	
	private String detail;
	
	private String remark;
	
	private String status;
	
	private String position;
	
	private String country;

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

	public Date getScheduleday() {
		return scheduleday;
	}

	public void setScheduleday(Date scheduleday) {
		this.scheduleday = scheduleday;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
