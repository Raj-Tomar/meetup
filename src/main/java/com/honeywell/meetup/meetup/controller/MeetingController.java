package com.honeywell.meetup.meetup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.meetup.meetup.model.MeetingPlan;
import com.honeywell.meetup.meetup.service.MeetingService;


@RestController
public class MeetingController {

	private final static Logger LOG = LoggerFactory.getLogger(MeetingController.class);
	
	@Autowired
	private MeetingService meetingService;
	

	@PostMapping(value = {"/meetings"})
	public void createMeeting(@RequestBody MeetingPlan meetingPlan) {
		LOG.info("Creating meeting in : " + meetingPlan.getCity());
		meetingService.createMeeting(meetingPlan);
	}
	
	@GetMapping("/meetings")
	public List<MeetingPlan> getAllMeetings() {
		LOG.info("return all list of meetings");
		return meetingService.getAllMeetings();
	}
	
}
