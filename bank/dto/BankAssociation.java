package com.xworkz.bank.dto;
import com.xworkz.bank.dao.BankDTO;
public class BankAssociation 
{
	 private BankDTO dao;
	 private BankDTO[] bankDTOs=new BankDTO[5];
	 private int octopus=0;
	 public void save(BankDTO dto)
	 {
		 System.out.println(" save bank DTO ");

			if (this.octopus < this.bankDTOs.length && this.octopus >= 0) 
			{
				this.bankDTOs[this.octopus++] = dto;

			} 
			else 
			{
				System.out.println("Cannot create the bank DTOs :".concat(String.valueOf(this.octopus)));
			}
		}
		
		
		public void findBusByBankName(BankDTO dto)
		{
			System.out.println("invoked findBybankName");
			System.out.println("dto passed");

			for (int note = 0; note < this.bankDTOs.length; note++) 
			{
				BankDTO ref = this.bankDTOs[note];
				if (ref != null) 
				{
					System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
					String temp = ref.getName();
					System.out.println(temp);
					if (dto.equals(dto)) 
					{
						System.out.println( "name   found");
					
					}

				}
			}
			
		}
		
		public void displayBank() {
			System.out.println("invoked  display Bank");
		  }
}
