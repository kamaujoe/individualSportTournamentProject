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
@Table(name="JPA_SPORT")
public class Sport implements Serializable  {
	
	
	@Value("-1")
	private int competitionID;
	
	@Value("default competition")
	private String competitionName;
	
	@Value("10.0")
	private int competitors;
	
	
	//-> Default constructor
	public Sport() {
		System.err.println("Sport Created");
	}
	
	
	
	

	//-> GETTERS AND SETTERS
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCompetitionID() {
		return competitionID;
	}

	public void setCompetitionID(int competitionID) {
		this.competitionID = competitionID;
	}

	@Column(name="competitionName", nullable=false, length=25)
	public String getCompetitionName() {
		return competitionName;
	}

	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}

	@Column(name="competitors")
	public int getCompetitors() {
		return competitors;
	}

	public void setCompetitors(int competitors) {
		this.competitors = competitors;
	}
	
	

	@Override
	public String toString() {
		return "Sport [competitionID=" + competitionID + ", competitionName=" + competitionName + ", competitors="
				+ competitors + "]";
	}
	
	
	
	

}
