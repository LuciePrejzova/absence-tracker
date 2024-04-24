package com.FLsolutions.absenceTracker.dtos;

import java.util.List;

import com.FLsolutions.absenceTracker.models.Attendance;
import com.FLsolutions.absenceTracker.models.Kid;

public class KidResponseDto implements ResponseDto {

	private final Long sysId;
	private final String firstName;
	private final String lastName;
	private final String telNumber;
	private final String email;
	private final String userName;
	private final List<Attendance> attendance;
	private final int substitutes;
	private final int dayType;

	public KidResponseDto(Kid kid) {
		this.sysId = kid.getSysId();
		this.firstName = kid.getFirstName();
		this.lastName = kid.getLastName();
		this.telNumber = kid.getTelNumber();
		this.email = kid.getEmail();
		this.userName = kid.getUserName();
		this.attendance = kid.getAttendance();
		this.substitutes = kid.getSubstitutes();
		this.dayType = kid.getDayType();
	}

	public Long getSysId() {
		return sysId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public int getSubstitutes() {
		return substitutes;
	}

	public int getDayType() {
		return dayType;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

}
