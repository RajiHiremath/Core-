package com.xworkz.dp.dto;

public class BusDriverDTOStarter {

	public static void main(String[] args) {
		BusDriverDTO busdriver=new BusDriverDTO();
		busdriver.setName("Aniket");
		busdriver.setAge(40);
		busdriver.setWifeName("Meera");
		busdriver.setRoute("Haveri to Laxmeshwar");
		busdriver.setNoOfChildrens(2);
		busdriver.setPlace("Laxmeshwar");
		
BusDriverDTO busdriver1=new BusDriverDTO("Suresh",39,"Saniya","Mundargi to Gadag",3,"Gadag");		
BusDriverDTO busdriver2=new BusDriverDTO("Mithuna",30,"Rashi","Gangavti to Koppal",0,"Koppal");		
BusDriverDTO busdriver3=new BusDriverDTO("Sakket",29,"Ahalya","Koppal to Gangavti",3,"Ginigere");		
BusDriverDTO busdriver4=new BusDriverDTO("Rajjev",45,"Mangala","Davangere to Harihara",0,"Harpanalli");		
BusDriverDTO busdriver5=new BusDriverDTO("Chandu",39,"Neha","Hospet to Bangalore",1,"Mysore");	

BusDriverDTO[] ref=new BusDriverDTO[4];
ref[0]=busdriver1;
ref[3]=busdriver4;
ref[2]=busdriver5;
for(int rare=0;rare<ref.length;rare++)
{
	BusDriverDTO ref1=ref[rare];
	if(ref1!=null)
	{
		System.out.println(ref1.getName());
		System.out.println(ref1.getAge());
		System.out.println(ref1.getWifeName());
		System.out.println(ref1.getRoute());
		System.out.println(ref1.getNoOfChildrens());
		System.out.println(ref1.getPlace());
	}
	else
	{
		System.err.println("Index is pointing to null".concat(String.valueOf(rare)));
	}
}

}

}
