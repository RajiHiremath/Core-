package com.xworkz.dp.dao;
import com.xworkz.dp.dto.WebSeriesDTO;
import com.xworkz.dp.Constants.Genre;
public class WebSeriesDAO 
{
	private WebSeriesDTO[]  webseriesDTOs= new WebSeriesDTO[5];
    private int care;
   
  public void saveDetails(WebSeriesDTO dto)
  {
	  System.out.println("Saved Web Series is :".concat("null"));
    if(this.care<this.webseriesDTOs.length && this.care>=0)
	  {
		 this.webseriesDTOs[this.care++]=dto;
	  }
    else
     {
      System.out.println("Cannot save the web series :".concat(String.valueOf(this.care)));
     }
   }
  public void delete(int index) 
  {
	  
	if(index<this.webseriesDTOs.length && index>=0)
	{
		this.webseriesDTOs[index]=null;
		System.out.println("deleted the index :".concat(String.valueOf(index)));
	}
	else 
	{
		System.err.println("Cannot delete because the index is out of range");
	}
  }
  public void update(WebSeriesDTO dto,int count)
  {
	  if(count>=0 && count<this.webseriesDTOs.length)
	  {
		  this.webseriesDTOs[count]=dto;
	  }
	  else
	  {
		  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
	  }
  }
  public void displayDetails() 
  {
	for(int fare=0;fare<this.webseriesDTOs.length;fare++)
	{
		WebSeriesDTO store=this.webseriesDTOs[fare];
	   System.out.println(store);
	}
  }
  public WebSeriesDTO[] getWebseriesDTOs()
  {
	 return webseriesDTOs; 
  }
 public Genre getGenre()
 {
	 return genre;
 }
}