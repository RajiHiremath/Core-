package com.xworkz.dp.dao;
import com.xworkz.dp.dto.ClubDTO;


public class ClubDAO 
{
	private ClubDTO [] clubdtos=new  ClubDTO[5];
	   private int fire;
	   
	   public void save(ClubDTO dto)
		{
			if(this.fire>=0 && this.fire<this.clubdtos.length)
			{
				//System.out.println("Saved dto is :" +(dto) .concat(String.valueOf(this.fire)));
				this.clubdtos[this.fire++]=dto;
			}
			else
			{
				System.err.println("Cannot save the dto :" .concat(String.valueOf(this.fire)));
			}
			
		}
		public void delete(int index) 
		  {
			  
			if(index<this.clubdtos.length && index>=0)
			{
				this.clubdtos[index]=null;
				System.out.println("deleted the index :".concat(String.valueOf(index)));
			}
			else 
			{
				System.err.println("Cannot delete because the index is out of range");
			}
		  }
		  public void update(ClubDTO dto,int count)
		  {
			  if(count>=0 && count<this.clubdtos.length)
			  {
				  this.clubdtos[count]=dto;
				  System.out.println("updated dro :" +(dto));
			  }
			  else
			  {
				  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
			  }
		  }
		  public void displayDetails() 
		  {
			for(int fare=0;fare<this.clubdtos.length;fare++)
			{
				ClubDTO store=this.clubdtos[fare];
			   System.out.println(store);
			}
		  }
		  public ClubDTO[] getClubDTOs()
		  {
			 return clubdtos; 
		  }
}
