package com.xworkz.crud;

public class LabourStarter {

	public static void main(String[] args) {
		Labour labour=new Labour();
		
		labour.addName("Kavitha");
		labour.addName("Usha");
		labour.addName("Veeresh");
		labour.addName("Jayashree");
		labour.addName("Siddana");
		
		String [] array=labour.getName();
		for(int i=0;i<array.length;i++)
		{
			String sname=array[i];
			System.out.println(sname);
		}
		
		labour.deleteName(1);
		labour.displayDetails();
		
		labour.updateName(2,"ush");
		labour.displayDetails();
	}

}
