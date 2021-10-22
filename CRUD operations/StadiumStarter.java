package com.xworkz.crud;

public class StadiumStarter {

	public static void main(String[] args) {
		Stadium stadium=new Stadium();
		
		stadium.addName("Chinnaswamy Stadium");
		stadium.addName("Kittrurani Stadium");
		stadium.addName("Indra Gandhi Stadium");
		stadium.addName("APJ Abdul kalam Stadium");
		stadium.addName("Old Trafford");
		
		String [] array=stadium.getName();
		for(int i=0;i<array.length;i++)
		{
			String sname=array[i];
			System.out.println(sname);
		}
		
		stadium.deleteName(4);
		stadium.displayDetails();
		
		stadium.updateName(3,"Edin Gardens");
		stadium.displayDetails();
	}
}


