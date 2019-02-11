package com.honeywell.meetup.meetup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.meetup.meetup.model.MeetingPlan;

@Repository
public interface MeetingDao extends JpaRepository<MeetingPlan, Integer> {

}
