package com.medical.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.Ailments;
import com.medical.repositories.AilmentsRepository;

@Service
public class AilmentsService {
	@Autowired
	AilmentsRepository ailmentsRepository;

	public List<Ailments> findAll() {
		return (List<Ailments>) ailmentsRepository.findAll();
	}

	public Ailments save(Ailments ailments) {
		return ailmentsRepository.save(ailments);
	}

}