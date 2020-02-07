package com.microservice.webservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.webservice.limitsservice.Bean.LimitConfigBean;

@RestController
public class LimitConfigurationController {

	@Autowired
	LimitConfigapplication limitConfigapplication;
	@GetMapping("/limits")
	public LimitConfigBean limitCheck() {
		return new LimitConfigBean(limitConfigapplication.getMaximum(),limitConfigapplication.getMinimum());
	}
}
