package com.vinay.ConstructionCostEstimation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
private static Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main( String[] args )
    {
		CalculateCost calculatecost = new CalculateCost();
		
		LOGGER.info(calculatecost.getCost("standard", 8 , false));
		LOGGER.info(calculatecost.getCost("aboveStandard", 4 , false));	
		LOGGER.info(calculatecost.getCost("highStandard", 10 , false));
		LOGGER.info(calculatecost.getCost("highStandard", 12.5 , true));
		
    }
}
