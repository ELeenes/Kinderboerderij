package com.lisse.kinderboerderij.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisse.kinderboerderij.domein.Vrijwilliger;

@Service
@Transactional
public class VrijwilligerService {
	@Autowired
	VrijwilligerRepository r;
	
	public void aanHetWerk() {
		System.out.println("OK");
		r.save(new Vrijwilliger());
	}

}