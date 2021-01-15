package com.medical.repositories;

import org.springframework.data.repository.CrudRepository;

import com.medical.model.Details;

public interface DetailsRepository extends CrudRepository<Details, Integer> {

}