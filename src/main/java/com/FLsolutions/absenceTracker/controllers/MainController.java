package com.FLsolutions.absenceTracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FLsolutions.absenceTracker.services.KidService;
import com.FLsolutions.absenceTracker.dtos.*;
import com.FLsolutions.absenceTracker.models.Kid;
import com.FLsolutions.absenceTracker.models.Attendance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

@RestController
public class MainController {

	private final KidService kidService;

	public MainController(KidService kidService) {
		this.kidService = kidService;
	}

	@GetMapping("/kids")
	public ResponseEntity<List<KidResponseDto>> index() {
		List<KidResponseDto> responseKidList = kidService.getAllKids();
		return new ResponseEntity<>(responseKidList, HttpStatus.OK);
	}
	
	@GetMapping("/today")
	public ResponseEntity<List<KidResponseDto>> today(){
		LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		String thisDayString = dayOfWeek.toString();
		if(dayOfWeek == DayOfWeek.TUESDAY) {
			List<KidResponseDto> todaysKidList = kidService.getKidsWithAttendance(Attendance.TUE);
			return new ResponseEntity<>(todaysKidList, HttpStatus.OK);
		}else {
			List<KidResponseDto> responseKidList = kidService.getAllKids();
			return new ResponseEntity<>(responseKidList, HttpStatus.OK);
		}
	}

	@GetMapping("/kid")
	public String home() {
		Kid kid = kidService.getBySysId();
		return kid.getFirstName();

	}

}
