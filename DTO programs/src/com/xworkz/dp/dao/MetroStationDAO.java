package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MetroStationDTO;
public class MetroStationDAO {
  
	private MetroStationDTO[] metroStationdtos=new  MetroStationDTO[5];
	   private int fire;
	   
	   public void save(MetroStationDTO dto)
		{
			if(this.fire>=0 && this.fire<this.metroStationdtos.length)
			{
				//System.out.println("Saved dto is :" +(dto) .concat(String.valueOf(this.fire)));
				this.metroStationdtos[this.fire++]=dto;
			}
			else
			{
				System.err.println("Cannot save the dto :" .concat(String.valueOf(this.fire)));
			}
			
		}
		public void delete(int index) 
		  {
			  
			if(index<this.metroStationdtos.length && index>=0)
			{
				this.metroStationdtos[index]=null;
				System.out.println("deleted the index :".concat(String.valueOf(index)));
			}
			else 
			{
				System.err.println("Cannot delete because the index is out of range");
			}
		  }
		  public void update(MetroStationDTO dto,int count)
		  {
			  if(count>=0 && count<this.metroStationdtos.length)
			  {
				  this.metroStationdtos[count]=dto;
				  System.out.println("updated dro :" +(dto));
			  }
			  else
			  {
				  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
			  }
		  }
		  public void displayDetails() 
		  {
			for(int fare=0;fare<this.metroStationdtos.length;fare++)
			{
				MetroStationDTO store=this.metroStationdtos[fare];
			   System.out.println(store);
			}
		  }
		  public MetroStationDTO[] getMetroStationDTOs()
		  {
			 return metroStationdtos; 
		  }
}
