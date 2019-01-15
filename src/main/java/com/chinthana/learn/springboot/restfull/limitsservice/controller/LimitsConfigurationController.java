package com.chinthana.learn.springboot.restfull.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinthana.learn.springboot.restfull.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimts() {	
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
