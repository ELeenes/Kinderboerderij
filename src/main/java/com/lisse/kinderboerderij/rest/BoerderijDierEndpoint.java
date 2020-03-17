package com.lisse.kinderboerderij.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lisse.kinderboerderij.controller.BoerderijDierService;
import com.lisse.kinderboerderij.domein.BoerderijDier;

@RestController
public class BoerderijDierEndpoint {

	@Autowired
	BoerderijDierService bds;
	
	@GetMapping("/getBoerderijDier")
	public Iterable<BoerderijDier> verkrijgBoerderijDier() {
		return bds.getAllBoerderijDieren();
	}
	
	@PostMapping("/postBoerderijDier")
	public BoerderijDier toevoegenBoerderijDier(@RequestBody BoerderijDier boerderijdier) {
		return bds.addBoerderijDier(boerderijdier);
	}
	
}