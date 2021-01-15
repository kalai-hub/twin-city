package com.medical.repositories;

import org.springframework.data.repository.CrudRepository;

import com.medical.model.Ailments;

public interface AilmentsRepository extends CrudRepository<Ailments, Long> {

}