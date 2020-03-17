package com.lisse.kinderboerderij.rest;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lisse.kinderboerderij.controller.VrijwilligerService;

@RestController
public class VrijwilligerEndpoint {

	@Autowired
	VrijwilligerService s;
	
	@GetMapping("/getVrijwilliger")
	public String getVrijwilliger() {
		System.out.println("Ok");
		s.aanHetWerk();
		return "actie voltooid";
	}
}
