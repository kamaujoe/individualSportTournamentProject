package com.mastek.training.olympics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mastek.training.olympics.entities.Venue;

@Component
public interface VenueRepository extends CrudRepository<Venue, Integer>{

}
