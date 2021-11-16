package com.xworkz.dp.dto;

public class SeasonDTOStarter {

	public static void main(String[] args) {
		
				
				SeasonDTO seasonDto=new SeasonDTO();
				
				seasonDto.setName("summer");
				seasonDto.setDuration("3 months");
				seasonDto.setTemperature(27.0f);
				seasonDto.setTypeFruit("Mango");
				
				SeasonDTO seasonDto1=new SeasonDTO("Spring","3 month",26.0f,"Cherries");
				SeasonDTO seasonDto2=new SeasonDTO("Winter","3 month",29.0f,"Apple");
				SeasonDTO seasonDto3=new SeasonDTO("Autumn","3 month",25.0f,"Limes");
				
				SeasonDTO[] ref=new SeasonDTO[5];
				ref[0]=seasonDto;
				ref[2]=seasonDto1;
				

				
	for(int lock=0;lock<ref.length;lock++)
	{
	 SeasonDTO ref1=ref[lock];
			 if(ref1!=null) 
			 {
	      		System.out.println(ref1.getName());
				System.out.println(ref1.getDuration());
				System.out.println(ref1.getTemperature());
				System.out.println(ref1.getTypeFruit());
		}
	else {
		System.out.println("ref1 is a null".concat(String.valueOf(lock)));
	}
	}
	}
}



	


