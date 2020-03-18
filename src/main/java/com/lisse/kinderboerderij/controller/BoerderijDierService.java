package com.lisse.kinderboerderij.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisse.kinderboerderij.domein.BoerderijDier;

@Service
@Transactional
public class BoerderijDierService {
	@Autowired
	BoerderijDierRepository bdr;
	
	public Iterable<BoerderijDier> getAllBoerderijDieren() {
		return bdr.findAll();
	}
	
	public BoerderijDier addBoerderijDier(BoerderijDier boerderijdier) {
		System.out.println("BoerderijDier toegevoegd aan Database");
		return bdr.save(boerderijdier);
	}
	
	public void deleteBoerderijDier(Long boerderijDierId) {
		System.out.println("Boerderijdier verwijderd uit Database");
		bdr.deleteById(boerderijDierId);
	}

	public BoerderijDier updateBoerderijDier(Long boerderijdierId, BoerderijDier boerderijdierDetails) {
		BoerderijDier boerderijdier = bdr.findById(boerderijdierId).get();
		return bdr.save(boerderijdier);
	}
}