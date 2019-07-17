package com.mastek.training.olympics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.mastek.training.olympics.apis.CompetitorsService;
import com.mastek.training.olympics.apis.SportService;
import com.mastek.training.olympics.apis.VenueService;
import com.mastek.training.olympics.entities.Competitors;
import com.mastek.training.olympics.entities.Sport;
import com.mastek.training.olympics.entities.Venue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OlympicsApplicationTests {

	@Autowired
	SportService sportService;
	
	@Autowired
	Sport sport;
	
	@Autowired
	CompetitorsService competitorsService;
	
	@Autowired
	Competitors competitors;
	
	@Autowired
	VenueService venueService;
	
	@Autowired
	Venue venue;
	
	@Test
	public void contextLoads() {
		System.out.println("System Test Executed");
	}
	
	
	//-> SPORT TEST CASES <-\\
	
	//-> ADD
	@Test
	public void addSportUsingService() {
		sport.setCompetitionID(1001); //->
		sport.setCompetitionName("Long Jump");
		sport.setCompetitors(10);
		
		sport = sportService.registerOrUpdateSport(sport);
		assertNotNull(sport);
	}
	
	//-> FIND
	@Test
	public void findBySportIDUsingService() {
		int sportID = 1;
		assertNotNull(sportService.findBySportID(sportID));
	}
	
	//-> DELETE
	@Test
	public void deleteBySportIDUsingService() {
		
		int sportID = 2;
		sportService.deleteBySportID(sportID);
		assertNull(sportService.findBySportID(sportID));
	}

	
	//-> USE LATER for CHECKING DATA BY PARAMETER
	
//	@Test
//	public void checkFetchByLocation() {
//		List<Sport> sport = sportService.findByCompetitionName("Long Jump");
//		for (Sport Sport : sport) {
//			System.out.println(sport);
//		}
//		assertEquals(sport.size(), 4);
//	}
	

}
