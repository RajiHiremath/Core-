package com.xworkz.dp;
import com.xworkz.dp.dao.BucketDAO;

import com.xworkz.dp.dto.BucketDTO;


public class BucketStarter {

	public static void main(String[] args) 
	{
	BucketDTO bucketdto=new BucketDTO("Black","small",200,"good",150.0f,"Letica");
	BucketDTO bucketdto1=new BucketDTO("pink","large",600,"better",250.0f,"U.S. Plastics");
	BucketDTO bucketdto2=new BucketDTO("Orange","small",200,"best",100.0f,"Affordable Buckets");
	BucketDTO bucketdto3=new BucketDTO("white","medium",400,"good",200.0f,"Encore Plastics");
	BucketDTO bucketdto4=new BucketDTO("blue","extra small",100,"better",50.0f,"Home Depot");
		  
	BucketDAO bucketDAO=new BucketDAO();
	bucketDAO.save(bucketdto1);
	bucketDAO.save(bucketdto3);
	bucketDAO.save(bucketdto4);
	bucketDAO.save(bucketdto);

	BucketDTO[] ref=bucketDAO.getBucketDTOs();
	for(int count=0;count<ref.length;count++)
	{
		BucketDTO ref1=ref[count];
		if(ref1!=null)
		{
		System.out.println(ref1.getColour());
		System.out.println(ref1.getSize());
		System.out.println(ref1.getPrice());
		System.out.println(ref1.getQuantity());
		System.out.println(ref1.getWeight());
		System.out.println(ref1.getCompany());
		System.err.println("!!!!!!!!!!!!!!!!");
		}
		else
		{
			System.err.println("Refence is pointing to null :" .concat(String.valueOf(count)));
		}
	 }
	bucketDAO.delete(1);
	bucketDAO.displayDetails();
	}
	
	}


