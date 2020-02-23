package com.epam.Logging;
import  org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleInterest_CompoundInterest 
{
	static final Logger LOGGER = LogManager.getLogger(SimpleInterest_CompoundInterest.class);
	
	public static double simpleInterest(double Principal,int time,double rateOfInterest)
	{
		return (Principal*time*rateOfInterest)/(float)100;
	}
	
	public static double compoundInterest(double Principal,double rateOfInterest,double noOfYearsDeposited,int compoundedTimes)
	{
		return Principal*Math.pow((1+rateOfInterest/noOfYearsDeposited),compoundedTimes*noOfYearsDeposited);
	}
}
