package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TempleDTO;
public class TempleDAO {
	 private TempleDTO[] templedtos=new TempleDTO[5];
	 private int count;
	public void save(TempleDTO dto)
	{
		if(this.count>=0 && this.count<this.templedtos.length)
		{
			//System.out.println("Saved dto is :" +(dto) .concat(String.valueOf(this.count)));
			this.templedtos[this.count++]=dto;
		}
		else
		{
			System.err.println("Cannot save the dto :" .concat(String.valueOf(this.count)));
		}
		
	}
	public void delete(int index) 
	  {
		  
		if(index<this.templedtos.length && index>=0)
		{
			this.templedtos[index]=null;
			System.out.println("deleted the index :".concat(String.valueOf(index)));
		}
		else 
		{
			System.err.println("Cannot delete because the index is out of range");
		}
	  }
	  public void update(TempleDTO dto,int count)
	  {
		  if(count>=0 && count<this.templedtos.length)
		  {
			  this.templedtos[count]=dto;
			  System.out.println("updated dro :" +(dto));
		  }
		  else
		  {
			  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
		  }
	  }
	  public void displayDetails() 
	  {
		for(int fare=0;fare<this.templedtos.length;fare++)
		{
			TempleDTO store=this.templedtos[fare];
		   System.out.println(store);
		}
	  }
	  public TempleDTO[] getTempleDTOs()
	  {
		 return templedtos; 
	  }
}
	

