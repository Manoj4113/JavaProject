package com.callcenter;



import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class CallDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String fromNumber;
	LocalDateTime startTime;
	LocalDateTime endTime;
	@Override
	public String toString() {
		return "CallDetails [id=" + id + ", fromNumber=" + fromNumber + ", startTime=" + startTime + ", endTime="
				+ endTime + ", duration=" + duration + "]";
	}
	int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromNumber() {
		return fromNumber;
	}
	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public CallDetails(int id, String fromNumber, LocalDateTime startTime, LocalDateTime endTime, int duration) {
		super();
		this.id = id;
		this.fromNumber = fromNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
	}
	public CallDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
