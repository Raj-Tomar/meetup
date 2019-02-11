package com.honeywell.meetup.meetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.honeywell"})
public class MeetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetupApplication.class, args);
	}

}

