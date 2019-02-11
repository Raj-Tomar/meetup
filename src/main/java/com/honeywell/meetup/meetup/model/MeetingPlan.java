package com.honeywell.meetup.meetup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MeetingPlan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String ogranizerName;
	@Column
	private String meetingAgenda;
	private String meetingDate;
	@Column
	private String city;
	@Column
	private String contact;

	public MeetingPlan() {
		
	}
	
	public MeetingPlan(int id, String ogranizerName, String meetingAgenda, String meetingDate, String city, String contact) {
		super();
		this.id = id;
		this.ogranizerName = ogranizerName;
		this.meetingAgenda = meetingAgenda;
		this.meetingDate = meetingDate;
		this.city = city;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOgranizerName() {
		return ogranizerName;
	}
	public void setOgranizerName(String ogranizerName) {
		this.ogranizerName = ogranizerName;
	}
	public String getMeetingAgenda() {
		return meetingAgenda;
	}
	public void setMeetingAgenda(String meetingAgenda) {
		this.meetingAgenda = meetingAgenda;
	}
	
	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

}
