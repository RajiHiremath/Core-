package com.xworkz.dp;
import com.xworkz.dp.dao.ClubDAO;
import com.xworkz.dp.dto.ClubDTO;
public class ClubStarter 
{
 public static void main(String[] args) 
   {
		ClubDTO clubdto=new ClubDTO(70,10,9.1f,500,20);
		ClubDTO clubdto1=new ClubDTO(20,5,8.2f,600,30);
		ClubDTO clubdto2=new ClubDTO(20,40,7.21f,900,10);
		ClubDTO clubdto3=new ClubDTO(50,100,4.3f,550,20);
		ClubDTO clubdto4=new ClubDTO(30,60,5.5f,200,5);
				  
		ClubDAO clubDAO=new ClubDAO();
		clubDAO.save(clubdto);
		clubDAO.save(clubdto2);
		clubDAO.save(clubdto4);
		clubDAO.save(clubdto1);

		ClubDTO[] ref=clubDAO.getClubDTOs();
			for(int count=0;count<ref.length;count++)
			{
				ClubDTO ref1=ref[count];
				if(ref1!=null)
				{
				System.out.println(ref1.getNoOfPeople());
				System.out.println(ref1.getNoOfBottle());
				System.out.println(ref1.getRating());
				System.out.println(ref1.getEntryPrice());
				System.out.println(ref1.getNoOfStaff());
				System.err.println("!!!!!!!!!!!!!!!!");
				}
				else
				{
					System.err.println("Refence is pointing to null :" .concat(String.valueOf(count)));
				}
			 }
			clubDAO.delete(1);
			clubDAO.displayDetails();
			}
		}


