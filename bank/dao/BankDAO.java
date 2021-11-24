package com.xworkz.bank.dao;

public interface BankDAO 
{
	boolean save(BankDTO bankdto);
	BankDTO findByBankName(String name);
	default void displayBanksDetails() {
}
}
