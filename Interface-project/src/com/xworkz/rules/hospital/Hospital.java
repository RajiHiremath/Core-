package com.xworkz.rules.hospital;

public class Hospital implements HospitalAdmitRule,HospitalDischargeRule
{

	@Override
	public String register() {
		System.out.println("invoked register of patient");
		return "pavitra";
	}

	@Override
	public double payAdvance() {
		System.out.println("invoked pay advance of patient");
		return 150895d;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked valid insurance");
		return true;
	}

	@Override
	public boolean payBill() {
		System.out.println("invoked paybill of patient");
		return true;
	}

	@Override
	public double discount() {
		System.out.println("invoked discount of patient");
		return 8578592d;
	}

}
