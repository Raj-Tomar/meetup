package com.honeywell.meetup.meetup.service;

import java.util.List;

import com.honeywell.meetup.meetup.model.MeetingPlan;

public interface MeetingService {

	public void createMeeting(MeetingPlan meetingPlan);
	
	public List<MeetingPlan> getAllMeetings();
}
 