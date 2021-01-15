package com.medical.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Treatments {
	
	@Id
	@GeneratedValue
	private int scid;
	@NotNull
	@Size(min=1,max=50, message="The size must be between 1 and 50")
	private String name;
	@NotNull
	@Size(min=1,max=50, message="The size must be between 1 and 50")
	private String treatmentType;
	@NotNull(message="May not be null")
	
	@OneToMany(mappedBy="treatments")
	private List<Details>  
	details = new ArrayList<Details>();
	
	@OneToMany(mappedBy="treatments")
	private List<Ailments>
	ailments = new ArrayList<Ailments>();

	
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}

	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Treatments scid=" + scid + ", name=" + name + ", treatmentType=" + treatmentType + ", balance=" ;

	}

}
