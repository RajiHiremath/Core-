package com.xworkz.dp.dto;

public class CraneStarter 
{
  public static void main(String[] args) 
  {
		Crane crane=new Crane();
		crane.setBrand("Terex");
		crane.setType("Tower");
		crane.setPrice(650050.0);
		crane.setWorking(true);
		crane.setModel("AC 100");
		
		Crane crane1=new Crane("Liebherr", "Mobile", 125894.0, true,"220 t Liebherr crawler");
		Crane crane2=new Crane("Cargotec", "Merchant ship", 780050.0, false, "CE-IMX6-01 ");
		Crane crane3=new Crane("Konecranes", "hoist cranes", 480065.0, true, "8 ESP.9");
		Crane crane4=new Crane("Manitowoc Cranes", "Construction Type ", 980045.0, false, "MAX-ER ");
		Crane crane5=new Crane("Palfinger", "Single Girder", 880050.0, false, "PK 23002");
		
   Crane[] ref=new Crane[5];
   ref[0]=crane2;
   ref[4]=crane1;
   ref[2]=crane;
   ref[1]=crane3;
   for(int fair=0;fair<ref.length;fair++)
   {
	Crane ref1=ref[fair];
	if(ref1!=null)
	{
	 System.out.println(ref1.getBrand());
	 System.out.println(ref1.getType());
	 System.out.println(ref1.getPrice());
	 System.out.println(ref1.isWorking());
	 System.out.println(ref1.getModel());
	}
	else
	{
	 System.out.println("Index is pointing to null".concat(String.valueOf(fair)));
	}
   }
 }
}
