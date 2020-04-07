package com.lisse.kinderboerderij.controller;

import org.springframework.data.repository.CrudRepository;   
import org.springframework.stereotype.Component;

import com.lisse.kinderboerderij.domein.Vrijwilliger;

@Component
public interface VrijwilligerRepository extends CrudRepository<Vrijwilliger, Long> {

}