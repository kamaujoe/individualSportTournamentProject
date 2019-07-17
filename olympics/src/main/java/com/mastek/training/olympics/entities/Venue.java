package com.mastek.training.olympics.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Entity
@Scope("prototype")
@Table(name="JPA_VENUE")
public class Venue implements Serializable {
	
	
	@Value("-1")
	private int venueID;
	
	@Value("Wembly")
	private String location;
	
	@Value("10000.00")
	private int capacity;
	
	public Venue() {
		System.out.println("Venue created");
	}
	
	
	//-> GETTERS AND SETTERS

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getVenueID() {
		return venueID;
	}

	public void setVenueID(int venueID) {
		this.venueID = venueID;
	}

	@Column(name="Location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name="Capacity")
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	

}
