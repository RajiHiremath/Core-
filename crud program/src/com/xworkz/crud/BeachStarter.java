package com.xworkz.crud;

public class BeachStarter {

	public static void main(String[] args) {
		BeachOperator beach=new BeachOperator();
		String sname=beach.getName();
		System.out.println(sname);
		beach.addBeachName("rk beach");
		beach.addCountry("India");
		beach.addBeachName("gokak");
		beach.addCountry("India");
		beach.addBeachName("goa");
		beach.addCountry("India");
		beach.addBeachName("maldievs");
		beach.addCountry("South Asia");
		beach.addBeachName("mangalore");
		beach.addCountry("India");
		
		beach.displayBeach();
	}

}
