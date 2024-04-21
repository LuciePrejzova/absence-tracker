package com.FLsolutions.absenceTracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FLsolutions.absenceTracker.services.KidService;
import com.FLsolutions.absenceTracker.services.KidServiceImpl;

@RestController
public class MainController {
	
	private final KidService kidService;
	
	public MainController(KidService kidService) {
        this.kidService = kidService;
    }
	
	 @GetMapping("/kids")
	    public String allKids() {
	        return kidService.getAllKids().toString();
	    }
	
	

}
