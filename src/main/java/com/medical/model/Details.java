package com.medical.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Details {
	@Id
	@GeneratedValue
	private int sid;
	@NotNull
    @Size(min=1,max=6, message = "Minimum size is 1 and Maximum size is 6")
	private String gender;
	private int age;
	@NotNull
	private BigDecimal weight;
	
	private String problems;
	
	@ManyToOne
	@JoinColumn(name="scid")
	private Treatments treatments;
		
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return gender;
	}
	public void setName(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public String getProblems() {
		return problems;
	}
	public void setProblems(String problems) {
		this.problems = problems;
	}
	public Treatments getTreatments() {
		return treatments;
	}
	public void setTreatments(Treatments treatments) {
		this.treatments = treatments;
	}
	@Override
	public String toString() {
		return problems; 
	}	
	
}
