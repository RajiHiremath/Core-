package com.xworkz.bank.dto;
import com.xworkz.bank.dao.BankDAO;
import com.xworkz.bank.dao.BankDTO;


public class BankBusiness  implements BankDAO {

	private BankDTO[] dtos= new BankDTO[10];
    private int counter;
    
	@Override
	public boolean save(BankDTO bankdto) {
		System.out.println("invoked save");
		return false;
	}

	@Override
	public BankDTO findByBankName(String name) {
		System.out.println("invoked by bank name");
		return null;
	}
	public void saveBank(BankDTO bankDTO, int y) {
		System.out.println("save bankDTOs dto and int cost:".concat(bankDTO.getName()));
		if (y >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] =bankDTO;
			System.out.println("create busDTOs dto and int cost:".concat(String.valueOf(y)));
		} else {
			System.out.println("Cannot create the Bank DTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBank(BankDTO bankdtos) {
		System.out.println("invoked save Bank DTO ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = bankdtos;

		} else {
			System.out.println("Cannot save bank dtos :".concat(String.valueOf(this.counter)));
		}
	}
    public void displayBanksDetails() {
	System.out.println("invoked all bank Details");
		
	}

	

}
