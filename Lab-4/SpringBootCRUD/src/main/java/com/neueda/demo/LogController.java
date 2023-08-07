package com.neueda.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	//create Logger
	
	Logger logger= LoggerFactory.getLogger(LogController.class);
	
	
	@RequestMapping("/log")
	public String log() {
		
		//test msgs
		logger.trace("Log Level: TRACE");
		logger.info("Log level: INFO");
		logger.debug("Log level: DEBUG");
		logger.error("Log level: ERROR");
		logger.warn("Log level: WARN");
		
		return "Hey ! Welcome to Springboot Logging";
		
	}

}
