package com.xworkz.diamond;

import com.xworkz.diamond.shop.Lalitha;
import com.xworkz.diamond.shop.Branch;
public class DiamondTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mine mine=new Mine();
     System.out.println(mine);
     String location=mine.getLocation();
     System.out.println(location);
     
     mine.setLocation("Ballari");
     String location1=mine.getLocation();
     System.out.println(location1);
     
     Lalitha lalitha=new Lalitha();
     System.out.println(lalitha);
     String ownerName=lalitha.getOwnerName();
     System.out.println(ownerName);
     
     Branch branch=new Branch();
     System.out.println(branch);
    }

}