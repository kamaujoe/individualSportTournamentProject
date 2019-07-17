package com.mastek.training.olympics.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.training.olympics.entities.Competitors;
import com.mastek.training.olympics.repository.CompetitorsRepository;


@Component
@Scope("singleton")
public class CompetitorsService {
	
	public CompetitorsService() {
		System.out.println("Competitors service Created");
	}
	
	
	//-> Database
	
	@Autowired
	private CompetitorsRepository competitorsRepository;
	
	public Competitors registerOrUpdateCompetitors(Competitors competitors) {
		
		competitors = competitorsRepository.save(competitors);
		System.out.println("Competitors Registered"+competitors);
		return competitors;
	}
	
	public Competitors findByCompetitorID(int competitorID) {
		
		try {
			return competitorsRepository.findById(competitorID).get();
			
		} catch (Exception e) { e.printStackTrace();
		return null;
			
		}
	}
	
	public void deleteBySportID(int competitorID) {
		
		competitorsRepository.deleteById(competitorID);
	}
	

}
