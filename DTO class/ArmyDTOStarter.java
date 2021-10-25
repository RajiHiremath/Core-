package com.xworkz.dp.dto;

public class ArmyDTOStarter 
{
  public static void main(String[] args) 
	{
	ArmyDTO army=new ArmyDTO();
	army.setCountry("India");
	army.setArmyType("Navy");
	army.setLocationOfMainBranch("New Delhi");
	army.setAmountInvested("1.0 million");
	army.setFounded(1895);
	army.setRole("Naval warfare");
	army.setUniformColour("White");
	
	ArmyDTO army1=new ArmyDTO("India","Air Force","Mumbai","1 million",1932, "Aerial Warfare","Sky blue");
	ArmyDTO army2=new ArmyDTO("US","Navy","Pentagon","1.37 million",1784,"Royal Naval Reserve warfare","White");
	ArmyDTO army3=new ArmyDTO("China","Navy","Ningbo","2.8 million",1949,"Naval warfare","White");
	ArmyDTO army4=new ArmyDTO("Russia","Navy","Saint Petersburg","1.52 million",1992, "Naval Warfare","White or black");
	
	ArmyDTO[] ref=new ArmyDTO[4];
	ref[0]=army1;
	ref[3]=army2;
	for(int force=0;force<ref.length;force++)
	{
		ArmyDTO ref1=ref[force];
		if(ref1!=null)
		{
		System.out.println(ref1.getCountry());
		System.out.println(ref1.getArmyType());
		System.out.println(ref1.getLocationOfMainBranch());
		System.out.println(ref1.getAmountInvested());
		System.out.println(ref1.getFounded());
		System.out.println(ref1.getRole());
		System.out.println(ref1.getUniformColour());
		}
		else
		{
		 System.err.println("Index is pointing to null". concat(String.valueOf(force)));	
		}
	}
}

}
