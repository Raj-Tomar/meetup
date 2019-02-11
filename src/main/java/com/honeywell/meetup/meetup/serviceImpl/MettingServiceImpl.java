package com.honeywell.meetup.meetup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.meetup.meetup.dao.MeetingDao;
import com.honeywell.meetup.meetup.model.MeetingPlan;
import com.honeywell.meetup.meetup.service.MeetingService;

@Service
public class MettingServiceImpl implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public void createMeeting(MeetingPlan meeting) {
		meetingDao.save(meeting);
	}

	@Override
	public List<MeetingPlan> getAllMeetings() {
		return meetingDao.findAll();
	}

}
