package com.xworkz.dp.dao;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {
  
	 private DressCodeDTO[] dressCodedtos=new DressCodeDTO[5];
	 private int care;
	public void saveDetails(DressCodeDTO dto)
	  {
		  System.out.println("Saved Web Series is :".concat("null"));
	    if(this.care<this.dressCodedtos.length && this.care>=0)
		  {
			 this.dressCodedtos[this.care++]=dto;
		  }
	    else
	     {
	      System.out.println("Cannot save the web series :".concat(String.valueOf(this.care)));
	     }
	   }
	  public void delete(int index) 
	  {
		  
		if(index<this.dressCodedtos.length && index>=0)
		{
			this.dressCodedtos[index]=null;
			System.out.println("deleted the index :".concat(String.valueOf(index)));
		}
		else 
		{
			System.err.println("Cannot delete because the index is out of range");
		}
	  }
	  public void update(DressCodeDTO dto,int count)
	  {
		  if(count>=0 && count<this.dressCodedtos.length)
		  {
			  this.dressCodedtos[count]=dto;
			  System.out.println("updated dro :" +(dto));
		  }
		  else
		  {
			  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
		  }
	  }
	  public void displayDetails() 
	  {
		for(int fare=0;fare<this.dressCodedtos.length;fare++)
		{
			DressCodeDTO store=this.dressCodedtos[fare];
		   System.out.println(store);
		}
	  }
	  public DressCodeDTO[] getDressCodeDTOs()
	  {
		 return dressCodedtos; 
	  }
}
