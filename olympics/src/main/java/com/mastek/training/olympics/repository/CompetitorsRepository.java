package com.mastek.training.olympics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mastek.training.olympics.entities.Competitors;

@Component
public interface CompetitorsRepository extends CrudRepository<Competitors, Integer> {
	


}
