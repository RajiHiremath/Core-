package com.xworkz.dp.dto;

public class ParkDTOStarter {

public static void main(String[] args) {
		
		ParkDTO parkDto=new ParkDTO();
				
	parkDto.setName("Navanandana");
	parkDto.setLocation("BTM");
	parkDto.setNoOfbenches(10);
	parkDto.setExerciseTools(true);
	parkDto.setOpenTime("8:00am");
	parkDto.setCloseTime("7:30pm");
		       
	ParkDTO parkDto1=new ParkDTO("Shiva","Jayanagar",8,false,"8:00am","8:00pm");
	ParkDTO parkDto2=new ParkDTO("Shivarama","Gadag",8,true,"8:00am","8:00pm");
	ParkDTO parkDto3=new ParkDTO("vinayak","Navanagar",8,false,"8:00am","8:00pm");
	ParkDTO parkDto4=new ParkDTO("Ram","Bilagi",8,false,"8:00am","8:00pm");
	ParkDTO parkDto5=new ParkDTO("Jayashankar","Vidyagiri",8,false,"8:00am","8:00pm");
				
				ParkDTO[] ref=new ParkDTO[5];
				ref[0]=parkDto;
				ref[2]=parkDto1;
				ref[3]=parkDto2;
				ref[1]=parkDto4;
				
				for(int lock=0;lock<ref.length;lock++)
				{
					ParkDTO ref1=ref[lock];
					if(ref1!=null) {
					System.out.println(ref1.getName());
					System.out.println(ref1.getLocation());
					System.out.println(ref1.getNoOfbenches());
					System.out.println(ref1.isExerciseTools());
					System.out.println(ref1.getOpenTime());
					System.out.println(ref1.getCloseTime());
					}
					else {
						System.out.println("ref1 is a null".concat(String.valueOf(lock)));
					}
					}
				
			}

		}

	


