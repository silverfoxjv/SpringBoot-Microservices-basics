package com.in28minutes.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@GetMapping(path="/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(1000, 1);
	}
	
}
