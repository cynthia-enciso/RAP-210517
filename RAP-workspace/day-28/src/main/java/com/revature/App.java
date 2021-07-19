package com.revature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.controllers.Controller;

public class App {
	private static final Logger LOG = LogManager.getLogger(Controller.class);
	
	public static void main(String[] args) {
		// logging examples
		LOG.trace("This is my trace message.");
		LOG.debug("This is my debug message.");
		LOG.info("This is my info message.");
		LOG.warn("This is my warn message.");
		LOG.error("This is my error message.");
		LOG.fatal("This is my fatal message.");
		
		LOG.trace("Before calling Controller.init()");
		Controller.init();
		LOG.trace("After calling Controller.init()");
	}
}
