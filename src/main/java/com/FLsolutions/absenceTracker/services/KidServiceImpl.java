package com.FLsolutions.absenceTracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.FLsolutions.absenceTracker.models.Kid;
import com.FLsolutions.absenceTracker.repositories.KidRepository;


@Service
public class KidServiceImpl implements KidService{
	
    private KidRepository kidRepository;

    public KidServiceImpl(KidRepository kidRepository) {
        this.kidRepository = kidRepository;
    }

	@Override
	public List<Kid> getAllKids() {
		return kidRepository.findAll();
	}

}
