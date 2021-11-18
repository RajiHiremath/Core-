package com.xworkz.amazon.dto;

import com.xworkz.amazon.dao.AmazonCartDAO;
import com.xworkz.amazon.dao.CartDTO;


public class AmazonBusiness 
{

	 private AmazonCartDAO dao;
	 private CartDTO[] cartDTOs=new CartDTO[5];
	 private int octopus=0;
	 public void saveCart(CartDTO dto)
	 {
		 System.out.println(" save CartDTO ");

			if (this.octopus < this.cartDTOs.length && this.octopus >= 0) 
			{
				this.cartDTOs[this.octopus++] = dto;

			} 
			else 
			{
				System.out.println("Cannot create the cartlDTOs :".concat(String.valueOf(this.octopus)));
			}
		}
		
		
		public void findCartByName(CartDTO dto)
		{
			System.out.println("invoked findCartByName");
			System.out.println("dto passed");

			for (int note = 0; note < this.cartDTOs.length; note++) 
			{
				CartDTO ref = this.cartDTOs[note];
				if (ref != null) 
				{
					System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
					String temp = ref.getName();
					System.out.println(temp);
					if (dto.equals(dto)) 
					{
						System.out.println("Cart name  found");
					
					}

				}
			}
			
		}
		
		public void displayCart() {
			System.out.println("invoked  displayCart ");
		}

}
