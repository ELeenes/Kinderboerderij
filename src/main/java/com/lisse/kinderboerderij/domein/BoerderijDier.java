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
	public int leeftijd;
	public String gezondheid;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDierSoort() {
		return dierSoort;
	}
	
	public void setDierSoort(String dierSoort) {
		this.dierSoort = dierSoort;
	}
	
	public String getGeslacht() {
		return geslacht;
	}
	
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getLeeftijd() {
		return leeftijd;
	}
	
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	
	public String getGezondheid() {
		return gezondheid;
	}
	
	public void setGezondheid(String gezondheid) {
		this.gezondheid = gezondheid;
	}
	
}
