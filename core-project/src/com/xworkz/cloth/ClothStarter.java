package com.xworkz.cloth;
import com.xworkz.cloth.work.Design;
public class ClothStarter {
      public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cloth cloth=new Cloth();
	 System.out.println(cloth);
	 
	 String type=cloth.getType();
	 System.out.println(type);
	 cloth.setType("ploythene");
	 String type1=cloth.getType();
	 System.out.println(type1);
	 
	 Material material=new Material();
	 System.out.println(material);
	 
     Design design=new Design();
	 System.out.println(design);
	 
com.xworkz.cloth.work.Cost cost= new com.xworkz.cloth.work.Cost();
	 System.out.println(cost);
}}
