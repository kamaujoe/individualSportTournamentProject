package com.mastek.training.olympics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mastek.training.olympics.entities.Sport;

@Component
public interface SportRepository extends CrudRepository<Sport, Integer> {
	

}
