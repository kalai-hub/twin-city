package com.medical.repositories;

import org.springframework.data.repository.CrudRepository;

import com.medical.model.Treatments;

public interface TreatmentsRepository extends CrudRepository<Treatments, Integer> {

}