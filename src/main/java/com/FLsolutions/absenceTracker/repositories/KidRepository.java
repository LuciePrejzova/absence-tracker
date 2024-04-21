package com.FLsolutions.absenceTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FLsolutions.absenceTracker.models.Kid;

public interface KidRepository extends JpaRepository<Kid, Long> {

}
