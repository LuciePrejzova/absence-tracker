package com.FLsolutions.absenceTracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FLsolutions.absenceTracker.services.KidService;
import com.FLsolutions.absenceTracker.dtos.*;
import com.FLsolutions.absenceTracker.models.Kid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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

	@GetMapping("/kid")
	public String home() {
		Kid kid = kidService.getBySysId();
		return kid.getFirstName();

	}

}
