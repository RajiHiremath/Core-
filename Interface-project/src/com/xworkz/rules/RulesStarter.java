package com.xworkz.rules;

import com.xworkz.rules.africa.AfricanCitizen;
import com.xworkz.rules.indian.IndianCitizen;
import com.xworkz.rules.marriage.MarriageRule;
import com.xworkz.rules.traffic.TrafficRule;
import com.xworkz.rules.voting.VotingRule;


public class RulesStarter {

	public static void main(String[] args) {
		
		VotingRule voting=new IndianCitizen();
		voting.validAge();
		voting.validID();
		
		TrafficRule traffic=new IndianCitizen();
		traffic.licenseNo();
		traffic.validInsurance();
		traffic.validLicense();	
		
		MarriageRule marriage=new IndianCitizen();
		marriage.validAge('F',19);
		System.err.println("////////////////");
		
		IndianCitizen indian=new IndianCitizen();
		System.out.println(indian.validAge());
		System.out.println(indian.validID());
		System.out.println(indian.licenseNo());
		System.out.println(indian.validInsurance());
		System.out.println(indian.validLicense());
		System.out.println(indian.validAge('M', 21));
		indian.displayNameAndAddressDetails();
		String name=indian.getName();
		System.out.println(name);
		String address=indian.getAddress();
		System.out.println(address);
		System.err.println("&&&&&&&&&&&&&");
		
		IndianCitizen indian1=new IndianCitizen();
		System.out.println(indian1.validAge());
		System.out.println(indian1.validID());
		System.out.println(indian1.licenseNo());
		System.out.println(indian1.validInsurance());
		System.out.println(indian1.validLicense());
		System.out.println(indian1.validAge('M', 22));
		indian.displayNameAndAddressDetails();
		indian.setName("Anu");
		String name1=indian.getName();
		System.out.println(name1);
		indian.setAddress("BTM");
		String address1=indian.getAddress();
		System.out.println(address1);
		System.err.println("&&&&&&&&&&&&&");
		
		IndianCitizen indian2=new IndianCitizen();
		System.out.println(indian2.validAge());
		System.out.println(indian2.validID());
		System.out.println(indian2.licenseNo());
		System.out.println(indian2.validInsurance());
		System.out.println(indian2.validLicense());
		System.out.println(indian2.validAge('M', 22));
		indian2.displayNameAndAddressDetails();
		indian2.setName("Mahesh");
		String name2=indian2.getName();
		System.out.println(name2);
		indian2.setAddress("July Nagara");
		String address2=indian2.getAddress();
		System.out.println(address2);
		System.err.println("&&&&&&&&&&&&&");
		
		IndianCitizen indian3=new IndianCitizen();
		System.out.println(indian3.validAge());
		System.out.println(indian3.validID());
		System.out.println(indian3.licenseNo());
		System.out.println(indian3.validInsurance());
		System.out.println(indian3.validLicense());
		System.out.println(indian3.validAge('M', 22));
		indian3.displayNameAndAddressDetails();
		indian3.setName("Shailaja");
		String name3=indian.getName();
		System.out.println(name3);
		indian3.setAddress("Jai nagara");
		String address3=indian3.getAddress();
		System.out.println(address3);
		System.err.println("&&&&&&&&&&&&&");
		
		IndianCitizen indian4=new IndianCitizen();
		System.out.println(indian4.validAge());
		System.out.println(indian4.validID());
		System.out.println(indian4.licenseNo());
		System.out.println(indian4.validInsurance());
		System.out.println(indian4.validLicense());
		System.out.println(indian4.validAge('M', 22));
		indian4.displayNameAndAddressDetails();
		indian4.setName("Manju");
		String name4=indian4.getName();
		System.out.println(name4);
		indian4.setAddress("Gandhi chowka");
		String address4=indian4.getAddress();
		System.out.println(address4);
		System.err.println("++++++++++++++++++++++++++++++++++++++");
		
		AfricanCitizen africa=new AfricanCitizen();
		System.out.println(africa.validAge());
		System.out.println(africa.validID());
		System.out.println(africa.licenseNo());
		System.out.println(africa.validInsurance());
		System.out.println(africa.validLicense());
		System.out.println(africa.validAge('M', 21));
		africa.displayDetails();
		String namez=africa.getName();
		System.out.println(namez);
		String addressz=africa.getStateName();
		System.out.println(addressz);
		System.err.println("&&&&&&&&&&&&&");
		
		AfricanCitizen africa1=new AfricanCitizen();
		System.out.println(africa1.validAge());
		System.out.println(africa1.validID());
		System.out.println(africa1.licenseNo());
		System.out.println(africa1.validInsurance());
		System.out.println(africa1.validLicense());
		System.out.println(africa1.validAge('M', 21));
		africa1.displayDetails();
		africa1.setName("Abdalla");
		String namez1=africa1.getName();
		System.out.println(namez1);
		africa1.setStateName("Cabo Verde.");
		String addressz1=africa1.getStateName();
		System.out.println(addressz1);
		System.err.println("&&&&&&&&&&&&&");
		
		AfricanCitizen africa2=new AfricanCitizen();
		System.out.println(africa2.validAge());
		System.out.println(africa2.validID());
		System.out.println(africa2.licenseNo());
		System.out.println(africa2.validInsurance());
		System.out.println(africa2.validLicense());
		System.out.println(africa2.validAge('M', 21));
		africa2.displayDetails();
		africa2.setName("Abdu");
		String namez2=africa2.getName();
		System.out.println(namez2);
		africa2.setStateName("Chad.");
		String addressz2=africa2.getStateName();
		System.out.println(addressz2);
		System.err.println("&&&&&&&&&&&&&");
		
		AfricanCitizen africa3=new AfricanCitizen();
		System.out.println(africa3.validAge());
		System.out.println(africa3.validID());
		System.out.println(africa3.licenseNo());
		System.out.println(africa3.validInsurance());
		System.out.println(africa3.validLicense());
		System.out.println(africa3.validAge('M', 21));
		africa3.displayDetails();
		africa3.setName("Abebe");
		String namez3=africa3.getName();
		System.out.println(namez3);
		africa3.setStateName("Botswana.");
		String addressz3=africa3.getStateName();
		System.out.println(addressz3);
		System.err.println("&&&&&&&&&&&&&");
		
		AfricanCitizen africa4=new AfricanCitizen();
		System.out.println(africa4.validAge());
		System.out.println(africa4.validID());
		System.out.println(africa4.licenseNo());
		System.out.println(africa4.validInsurance());
		System.out.println(africa4.validLicense());
		System.out.println(africa1.validAge('M', 21));
		africa4.displayDetails();
		africa4.setName("Amari");
		String namez4=africa4.getName();
		System.out.println(namez4);
		africa4.setStateName("Benin");
		String addressz4=africa4.getStateName();
		System.out.println(addressz4);
		System.err.println("&&&&&&&&&&&&&");
	}

}
