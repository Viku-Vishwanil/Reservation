package edu.jspiders.trainreservationapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_table")
public class TrainDTO implements Serializable
{
	@Id
	@Column(name="train_no")
	private int trainNo;
	@Column(name="train_name")
	private String trainName;
	@Column(name="source_station")
	private String sourceStation;
	@Column(name="destination_station")
	private String destinationStation;
	@Column(name="arrival_time")
	private String arrivalTime;
	@Column(name="departure_time")
	private String departureTime;
	
	public TrainDTO() 
	{
		
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() 
	{
		return trainNo + "\t\t" + trainName + "\t\t" + sourceStation
				+ "\t\t" + destinationStation + "\t\t" + arrivalTime + "\t\t"
				+ departureTime ;
	}
}
