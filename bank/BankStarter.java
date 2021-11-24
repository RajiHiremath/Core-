package com.xworkz.bank;

import com.xworkz.bank.dao.BankDTO;
import com.xworkz.bank.dto.BankBusiness;

public class BankStarter {

	public static void main(String[] args) {

		BankDTO bankDTOs = new BankDTO("ef8652","Canara bank","Gangavati","CNRB0000547");
		BankBusiness dto1 = new BankBusiness();
		dto1.saveBank(bankDTOs);
        dto1.saveBank(new BankDTO("sd123","SBI","Gangavti","SBIB23000034"));

        BankDTO ref1= dto1.findByBankName("");
		System.out.println(ref1);
		
		BankBusiness banks=new BankBusiness();
		System.out.println(banks.save(bankDTOs));
		System.out.println(banks.findByBankName(""));
		banks.displayBanksDetails();


	}

}
