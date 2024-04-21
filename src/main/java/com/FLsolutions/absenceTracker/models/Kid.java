package com.FLsolutions.absenceTracker.models;

import jakarta.persistence.*;
import com.FLsolutions.absenceTracker.models.User;

import java.util.List;

import com.FLsolutions.absenceTracker.models.Attendance;

@Entity
@Table(name = "kids")
public class Kid extends User{
		
	@ElementCollection
    @Enumerated(EnumType.STRING)
	private List<Attendance> attendance;
	private int substitutes;
	private int dayType; //1 = half day, 2 = full day
	
	public Kid(String firstName, String lastName, List<Attendance> attendance, int dayType) {
		super(firstName, lastName);
		this.substitutes = 0;
		this.attendance = attendance;
		this.dayType = dayType;
	}


	public List<Attendance> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}
	public int getSubstitutes() {
		return substitutes;
	}
	public void setSubstitutes(int substitutes) {
		this.substitutes = substitutes;
	}
	public int getDayType() {
		return dayType;
	}
	public void setDayType(int dayType) {
		this.dayType = dayType;
	}
	

}
