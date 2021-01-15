package com.medical.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.Treatments;
import com.medical.repositories.TreatmentsRepository;

// Service holds business logic and calls the method in the repository layer.
@Service
public class TreatmentsService {
	@Autowired
	TreatmentsRepository treatmentsRepository;

	// Show all treatments method
	public List<Treatments> findAll() {
		return (List<Treatments>) treatmentsRepository.findAll();
	}

	// Save method for the treatments
	public Treatments save(Treatments treatments) {
		return treatmentsRepository.save(treatments);
	}
}