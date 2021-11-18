package com.xworkz.amazon;

import com.xworkz.amazon.dao.ArrayAmazonCartDAO;
import com.xworkz.amazon.dao.CartDTO;


public class AmazonStarter {

	public static void main(String[] args) 
	{
		CartDTO cartDTOs = new CartDTO("MI", 5, 180, 4 );
		ArrayAmazonCartDAO dto1 = new ArrayAmazonCartDAO();
		dto1.saveCart(cartDTOs);

		dto1.saveCart(new CartDTO("VIO",2,100,3), 3);

		CartDTO ref = dto1.findByName("MI");
		System.out.println(ref);
		
		ArrayAmazonCartDAO arrayAmazonCartDAO=new ArrayAmazonCartDAO();
		System.out.println(arrayAmazonCartDAO.save(cartDTOs));
		System.out.println(arrayAmazonCartDAO.findByName("mi"));
		arrayAmazonCartDAO.displayAllCartDetails();
		}

}


