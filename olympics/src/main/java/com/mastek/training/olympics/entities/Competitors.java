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
@Table(name="JPA_COMPETITORS")
public class Competitors implements Serializable {

	
	@Value("-1")
	private int competitorID;
	
	@Value("Default Name")
	private String name;
	
	@Value("20")
	private int age;
	
	@Value("England")
	private String nationality;
	
	//-> default constructor
	public Competitors() {
		System.out.println("Competitors created");
	}
	
	
	
	
	
	//-> GETTERS AND SETTERS
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCompetitorID() {
		return competitorID;
	}

	public void setCompetitorID(int competitorID) {
		this.competitorID = competitorID;
	}

	@Column(name="Name")
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	@Column(name="Age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name="Nationality")
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Competitors [competitorID=" + competitorID + ", name=" + name + ", age=" + age + ", nationality="
				+ nationality + "]";
	}
	
	
	
	
	
	
	
}
