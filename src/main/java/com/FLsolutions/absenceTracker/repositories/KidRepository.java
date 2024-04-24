package com.FLsolutions.absenceTracker.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.FLsolutions.absenceTracker.models.Kid;
import com.FLsolutions.absenceTracker.models.Attendance;

public interface KidRepository extends JpaRepository<Kid, Long> {
	
	List<Kid> findAll();
	Kid findBySysId(int sysId);
	List<Kid> findByAttendanceContaining(Attendance attendance);
}
