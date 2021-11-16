package com.xworkz.dp;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;
import com.xworkz.dp.Constants.Genre;

public class WebSeriesStarter {

	public static void main(String[] args) 
	{
		WebSeriesDTO webseriesdto=new WebSeriesDTO();
		webseriesdto.setName("null");
		webseriesdto.setGenre(Genre.ACTION);
		webseriesdto.setCast("huj");
		webseriesdto.setNoOfCharacters(200);
		webseriesdto.setRating(5.0f);
		webseriesdto.setTotalSeason(8);
		webseriesdto.setCurrentSeason(5);
		
WebSeriesDTO webseriesdto1=new WebSeriesDTO("qwe",Genre.ANIMATION,"agyu",100,5.1f,3,1);
WebSeriesDTO webseriesdto2=new WebSeriesDTO("qewr",Genre.ACTION,"bhu",200,7.1f,5,1);
WebSeriesDTO webseriesdto3=new WebSeriesDTO("lopi",Genre.BIOGRAPHIC,"kko",300,6.99f,8,2);
WebSeriesDTO webseriesdto4=new WebSeriesDTO("vgyu",Genre.COMEDY,"ghu",500,8.88f,15,4);
WebSeriesDTO webseriesdto5=new WebSeriesDTO("cups",Genre.INSPRIED,"hjui",120,9.99f,20,5);
		
WebSeriesDAO ref =new WebSeriesDAO();
ref.saveDetails(webseriesdto1);
ref.saveDetails(webseriesdto3);

 WebSeriesDTO[] ref1=ref.getWebseriesDTOs();

  for(int fire=0;fire<ref1.length;fire++)
  {
	 WebSeriesDTO ref2= ref1[fire];
	  if(ref2!=null) 
	  {
	  System.out.println(ref2.getName());
	  System.out.println(ref2.getGenre());
	  System.out.println(ref2.getCast());
	  System.out.println(ref2.getNoOfCharacters());
	  System.out.println(ref2.getRating());
	  System.out.println(ref2.getTotalSeason());
	  System.out.println(ref2.getCurrentSeason());
	  System.err.println("~~~~~~~~~~~~~~~");
	  }
	  else
	  {
	  System.out.println("Reference is pointing to null".concat(String.valueOf(fire)));
	  }

	}
    webseriesdto1.delete(2);
    webseriesdto1.displayDetails();
	}
}

