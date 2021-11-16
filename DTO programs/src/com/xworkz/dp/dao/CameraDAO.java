package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CameraDTO;
public class CameraDAO {
   private CameraDTO [] cameradtos=new  CameraDTO[5];
   private int fire;
   
   public void save(CameraDTO dto)
	{
		if(this.fire>=0 && this.fire<this.cameradtos.length)
		{
			//System.out.println("Saved dto is :" +(dto) .concat(String.valueOf(this.fire)));
			this.cameradtos[this.fire++]=dto;
		}
		else
		{
			System.err.println("Cannot save the dto :" .concat(String.valueOf(this.fire)));
		}
		
	}
	public void delete(int index) 
	  {
		  
		if(index<this.cameradtos.length && index>=0)
		{
			this.cameradtos[index]=null;
			System.out.println("deleted the index :".concat(String.valueOf(index)));
		}
		else 
		{
			System.err.println("Cannot delete because the index is out of range");
		}
	  }
	  public void update(CameraDTO dto,int count)
	  {
		  if(count>=0 && count<this.cameradtos.length)
		  {
			  this.cameradtos[count]=dto;
			  System.out.println("updated dro :" +(dto));
		  }
		  else
		  {
			  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
		  }
	  }
	  public void displayDetails() 
	  {
		for(int fare=0;fare<this.cameradtos.length;fare++)
		{
			CameraDTO store=this.cameradtos[fare];
		   System.out.println(store);
		}
	  }
	  public CameraDTO[] getCameraDTOs()
	  {
		 return cameradtos; 
	  }
}
	

