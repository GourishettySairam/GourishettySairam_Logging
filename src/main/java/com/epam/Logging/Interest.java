package com.epam.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner ;
public class Interest 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(Interest.class);
		LOGGER.info("choose one option");
		LOGGER.debug("1.Simple Interest");
		LOGGER.info("2.Compound Interest");
		LOGGER.debug("choose ur option");
		switch(sc.nextInt()) 
		{
			case 1:
				LOGGER.info("Enter principal amount");
				double principal=sc.nextDouble();
				LOGGER.info("Enter rate of interest");
				double rateOfInterest = sc.nextDouble();
				LOGGER.debug("Enter time ");
				int time = sc.nextInt();
				double SimpleInterest = SimpleInterest_CompoundInterest.simpleInterest(principal, time, rateOfInterest);
				LOGGER.info("simple interest is "+SimpleInterest);
				break;
				
			case 2:
				LOGGER.info("Enter principal amount");
				double compoundPrincipal = sc.nextDouble();
				LOGGER.info("Enter rate of interest");
				double compoundRateOfInterest = sc.nextDouble()/100.0;
				LOGGER.info("no.of years deposited");
				double compoundNoOfYearsDeposited = sc.nextDouble();
				LOGGER.info("compounded times");
				int compoundedTimes = sc.nextInt();
				double compoundInterest = SimpleInterest_CompoundInterest.compoundInterest(compoundPrincipal,compoundRateOfInterest,compoundNoOfYearsDeposited,compoundedTimes);
				LOGGER.info("compound interest is " + compoundInterest);
				break;
				
			default:LOGGER.info("enter correct option");
					break;
			
		}
		
		
		sc.close();
	


	}

}
