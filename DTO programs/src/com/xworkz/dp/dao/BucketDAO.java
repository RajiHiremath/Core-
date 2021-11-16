package com.xworkz.dp.dao;
import com.xworkz.dp.dto.BucketDTO;

public class BucketDAO 
{
  private BucketDTO[] bucketdtos=new BucketDTO[5];
  private int rare;
  
  public void save(BucketDTO dto)
	{
		if(this.rare>=0 && this.rare<this.bucketdtos.length)
		{
			//System.out.println("Saved dto is :" +(dto) .concat(String.valueOf(this.rare)));
			this.bucketdtos[this.rare++]=dto;
		}
		else
		{
			System.err.println("Cannot save the dto :" .concat(String.valueOf(this.rare)));
		}
		
	}
	public void delete(int index) 
	  {
		  
		if(index<this.bucketdtos.length && index>=0)
		{
			this.bucketdtos[index]=null;
			System.out.println("deleted the index :".concat(String.valueOf(index)));
		}
		else 
		{
			System.err.println("Cannot delete because the index is out of range");
		}
	  }
	  public void update(TempleDTO dto,int count)
	  {
		  if(count>=0 && count<this.bucketdtos.length)
		  {
			  this.bucketdtos[count]=dto;
			  System.out.println("updated dro :" +(dto));
		  }
		  else
		  {
			  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
		  }
	  }
	  public void displayDetails() 
	  {
		for(int fare=0;fare<this.bucketdtos.length;fare++)
		{
			BucketDTO store=this.bucketdtos[fare];
		   System.out.println(store);
		}
	  }
	  public BucketDTO[] getBucketDTOs()
	  {
		 return bucketdtos; 
	  }
}
	
