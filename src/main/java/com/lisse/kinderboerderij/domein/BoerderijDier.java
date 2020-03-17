package com.lisse.kinderboerderij.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoerderijDier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String dierSoort;
	private String geslacht;
	private String naam;
	public String getGeslacht() {
		return geslacht;
	}
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	public String getDierSoort() {
		return dierSoort;
	}
	public void setDierSoort(String dierSoort) {
		this.dierSoort = dierSoort;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
}
