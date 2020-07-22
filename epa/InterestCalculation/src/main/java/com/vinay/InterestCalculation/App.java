package com.vinay.InterestCalculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main( String[] args )
    {
		CalculateInterest c = new CalculateInterest();
		
		LOGGER.error("Simple Interest : " + c.calculateSimpleInterest(10000, 3, 2));
		LOGGER.info("Simple Interest : " + c.calculateSimpleInterest(15000, 1.5, 2.5));
		
		LOGGER.info("Compound Interest : " + c.calculateCompoundInterest(10090, 3, 2));
		LOGGER.info("Compound Interest : " + c.calculateCompoundInterest(55000, 1.25, 1.5));
		
    }

}