package com.vvit.intrest_logger;

public class Intrest {
	public double SimpleIntrest(double principle_amount,double year,double rate_of_intrest)
	{
		return (principle_amount*year*rate_of_intrest)/100.0;
	}
	public double CompoundIntrest(double principle_amount,double year,double rate_of_intrest)
	{
		return principle_amount * Math.pow(1.0 + rate_of_intrest / 100.0 ,year) - principle_amount;
	}

}