package com.idesoft.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.idesoft.entity.Response;
import com.idesoft.services.LocalService;

@RestController
public class LocalController {

	final static Logger logger = Logger.getLogger(LocalController.class);
	
	@Autowired
	LocalService localService;

	@GetMapping("/search/{comuna}")
	public ResponseEntity<?> search(@PathVariable String comuna) {
		logger.info("Llamando servicio busqueda de locales por comuna");
		
		return new ResponseEntity<List<Response>>(localService.searchLocal(comuna), HttpStatus.OK);

	}

}
