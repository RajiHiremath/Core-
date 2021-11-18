package com.xworkz.rules;

import com.xworkz.rules.hospital.Hospital;

public class HospitalScammer 
{

	public static void main(String[] args) 
	{
		
		Hospital hospital=new Hospital();
		System.out.println(hospital.register());
		System.out.println(hospital.payAdvance());
		System.out.println(hospital.validInsurance());
		System.out.println(hospital.payBill());
		System.out.println(hospital.discount());
		
	}

}
