package com.epam.Logging;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyHouseConstruction {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(MyHouseConstruction.class);
		LOGGER.info("Enter area of house");
		double areaOfHouse = sc.nextDouble();
		
		LOGGER.info("do you want a fully automated home(yes/no)");
		String automatedHome = sc.next().toLowerCase();
		boolean fullyAutomatedHome;
		
		if("yes".compareTo(automatedHome) == 0)
			fullyAutomatedHome = true;
		else
			fullyAutomatedHome = false;
			
		sc.nextLine();
		LOGGER.info("Enter material standard");
		String materialStandard = sc.nextLine();
		
		double constructionCost = HouseConstructionCost.cost(materialStandard,areaOfHouse,fullyAutomatedHome);
		LOGGER.info("cost is " + constructionCost);
		
		sc.close();

	}

}
