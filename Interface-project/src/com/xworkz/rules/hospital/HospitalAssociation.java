package com.xworkz.rules.hospital;

public class HospitalAssociation 
{
       private String name;
	   private String location;
	   private String govt;
	   private HospitalAdmitRule hospitalAdmitRule;
	   private HospitalDischargeRule hospitalDischargeRule;
	   
	   public HospitalAssociation() 
	   {
		System.out.println("invoked HospitalAssociation no-arg const");
	   }
	   
	   
	 public HospitalAssociation(String name, String location, String govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) 
	 {
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	 }
	 
  
	 public String getName() 
	 {
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public String getLocation() 
	{
		return location;
	}


	public void setLocation(String location) 
	{
		this.location = location;
	}


	public String getGovt() 
	{
		return govt;
	}


	public void setGovt(String govt)
	{
		this.govt = govt;
	}
	public void dislayDetails()
	{
		System.out.println("invoked name,location,govt");
	}


	public void admitRule()
	 {
		 System.out.println("invoked admitRule of Patient");
		 if(this.hospitalAdmitRule!=null)
		 {
			 System.out.println("invoked Hospital admit rule");
			 String patientName=this.hospitalAdmitRule.register();
			 System.out.println("Admit the patient:".concat(patientName));
			 double amnt=this.hospitalAdmitRule.payAdvance();
			 System.out.println("Amount paid by patienct :"+amnt);
			 boolean validInsurance=this.hospitalAdmitRule.validInsurance();
			 if(validInsurance)
			 {
				 System.out.println("invoked valid Insurance");
			 }
			 else
			 {
				 System.err.println("invalid Insurance");
			 }
		 }
		 else
		  {
			System.err.println("Patient is not admitted");  
		  }
			 
		 }
	 
	public void dischargeRule()
	{
		System.out.println("invoked discharge rule of Patient");
		boolean bill=this.hospitalDischargeRule.payBill();
		if(bill)
		{
			System.out.println("invoked paybill of patient");
			double dis=this.hospitalDischargeRule.discount();
			System.out.println("Dicsount in patient bill :" + dis);
		}
		else
		{
			System.err.println("Dont discharge the patient");
		}
		
	}
}
