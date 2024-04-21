package com.FLsolutions.absenceTracker.services;

import org.springframework.stereotype.Service;

import com.FLsolutions.absenceTracker.repositories.KidRepository;


@Service
public class KidServiceImpl implements KidService{
	
    private KidRepository kidRepository;

    public KidServiceImpl(KidRepository kidRepository) {
        this.kidRepository = kidRepository;
    }

}
