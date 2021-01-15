package com.medical.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Ailments {
	
	@Id
	@GeneratedValue
	private int oid;
	@ManyToOne
	@JoinColumn(name="scid")
	@NotNull
	private Treatments treatments;
	@OneToOne
	@JoinColumn(name="sid")
	@NotNull
	private Details detail;
	private String consultation;

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Treatments getTreatments() {
		return treatments;
	}
	public void setTreatments(Treatments treatments) {
		this.treatments = treatments;
	}
	public Details getDetails() {
		return detail;
	}
	public void setDetails(Details detail) {
		this.detail = detail;
	}
	public String getConsultation() {
		return consultation;
	}
	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}
	@Override
	public String toString() {
		return "Ailments [oid=" + oid + ", Treatments=" + treatments + ", details=" + detail + ", consultation=" + consultation
				+ "]";
	}
}