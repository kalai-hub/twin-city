package com.medical.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.Details;
import com.medical.repositories.DetailsRepository;

@Service
public class DetailsService {
	@Autowired
	DetailsRepository detailsRepository;

	// Finds all details
	public List<Details> findAll() {
		return (List<Details>) detailsRepository.findAll();
	}

	// Saves details to the repository
	public Details save(Details details) {
		return detailsRepository.save(details);
	}
}