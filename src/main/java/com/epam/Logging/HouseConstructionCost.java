package com.epam.Logging;
import  org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCost 
{
	static final Logger LOGGER = LogManager.getLogger(HouseConstructionCost.class);
	public static double cost(String materialStandard,double areaOfHouse,boolean fullyAutomatedHome)
	{
		int costPerSquareFeet;
		double totalCost=0;
		
			if(materialStandard.compareTo("standard") == 0)
			{
				costPerSquareFeet = 1200; 
				totalCost = areaOfHouse * costPerSquareFeet;
			}
			
			else if(materialStandard.compareTo("above standard") == 0) 
			{
				costPerSquareFeet = 1500;
				totalCost =  areaOfHouse * costPerSquareFeet;
			}
			else if(materialStandard.compareTo("high standard") == 0) 
			{
				if(fullyAutomatedHome)
				{
					costPerSquareFeet = 2500;
					totalCost = areaOfHouse * costPerSquareFeet;
				}
				else
				{
					costPerSquareFeet = 1800;
					totalCost = areaOfHouse * costPerSquareFeet;
				}
			}
				
		
		return totalCost;
	}
}
