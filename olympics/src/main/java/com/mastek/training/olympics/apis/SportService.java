package com.mastek.training.olympics.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.training.olympics.entities.Sport;
import com.mastek.training.olympics.repository.SportRepository;

@Component
@Scope("singleton")
public class SportService {

	
	public SportService () {
		System.out.println("Sport Service Created");
	}
	
	
	//-> DataBase
	
	@Autowired
	private SportRepository sportRepository;
	
	public Sport registerOrUpdateSport(Sport sport) {
		
		sport = sportRepository.save(sport);
		System.out.println("Sport Registered"+sport);
		return sport;
	}
	
	public Sport findBySportID(int sportID) {
		
		try {
			return sportRepository.findById(sportID).get();
			
		} catch (Exception e) { e.printStackTrace();
		return null;
			
		}
	}
	
	public void deleteBySportID(int sportID) {
		
		sportRepository.deleteById(sportID);
	}
	
}
