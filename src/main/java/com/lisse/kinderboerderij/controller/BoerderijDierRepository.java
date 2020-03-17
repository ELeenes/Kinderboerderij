package com.lisse.kinderboerderij.controller;

import org.springframework.stereotype.Component;

import com.lisse.kinderboerderij.domein.BoerderijDier;

import org.springframework.data.repository.CrudRepository;

@Component
public interface BoerderijDierRepository extends CrudRepository<BoerderijDier, Long> {

}