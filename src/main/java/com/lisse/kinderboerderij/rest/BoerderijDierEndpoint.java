package com.lisse.kinderboerderij.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lisse.kinderboerderij.controller.BoerderijDierService;
import com.lisse.kinderboerderij.domein.BoerderijDier;


@RestController
public class BoerderijDierEndpoint {

	@Autowired
	BoerderijDierService bds;
	
	@GetMapping("/boerderijdier")
	public Iterable<BoerderijDier> verkrijgBoerderijDier() {
		return bds.getAllBoerderijDieren();
	}
	
	@PostMapping("/boerderijdier")
	public void toevoegenBoerderijDier(@RequestBody BoerderijDier boerderijdier) {
		bds.addBoerderijDier(boerderijdier);
	}
	@DeleteMapping("/boerderijdier/{id}")
	public void verwijderBoerderijDier(@PathVariable(value = "id") String boerderijDierId) {
	bds.deleteBoerderijDier(Long.parseLong(boerderijDierId));
	}
	
	
	@PutMapping("/boerderijdier/{id}")
	public void updateBD(@PathVariable(value = "id") Long id, @Valid @RequestBody
			BoerderijDier boerderijdier) {
		boerderijdier.setId(id);
		bds.addBoerderijDier(boerderijdier);
	}
	
}



