package com.mastek.training.olympics.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.mastek.training.olympics.entities.Venue;
import com.mastek.training.olympics.repository.VenueRepository;

@Component
@Scope("singleton")
public class VenueService {
	
	public VenueService() {
		System.out.println("Venue service Created");
	}
	
	
	//-> Database
	
	@Autowired
	private VenueRepository venueRepository;
	
	public Venue registerOrUpdateVenue(Venue venue) {
		
		venue = venueRepository.save(venue);
		System.out.println("Venue Registered"+venue);
		return venue;
	}
	
	public Venue findByVenueID(int venueID) {
		
		try {
			return venueRepository.findById(venueID).get();
			
		} catch (Exception e) { e.printStackTrace();
		return null;
			
		}
	}
	
	public void deleteByVenueID(int venueID) {
		
		venueRepository.deleteById(venueID);
	}

}
