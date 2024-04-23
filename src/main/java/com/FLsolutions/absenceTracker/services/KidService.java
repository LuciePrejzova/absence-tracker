package com.FLsolutions.absenceTracker.services;

import java.util.*;
import com.FLsolutions.absenceTracker.dtos.*;
import com.FLsolutions.absenceTracker.models.Kid;

public interface KidService {
	
	List<KidResponseDto> getAllKids();
	List<Kid> getKids();
	Kid getBySysId();

}
