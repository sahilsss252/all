package com.lti.model;

import java.time.LocalDate;
import java.util.List;

public class PnrStatus {

	private long pnrNo;
	private int trainNo;
	private LocalDate trvelDate;
	
	private List<Passenger> passengers;

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public LocalDate getTrvelDate() {
		return trvelDate;
	}

	public void setTrvelDate(LocalDate trvelDate) {
		this.trvelDate = trvelDate;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
}
