package com.xworkz.bank.dao;

public class BankDTO 
{
  private String id;
  private String name;
  private String branch;
  private String ifsc;
  
  
  public BankDTO() {
	System.out.println("invoked no-arg const");
   }


public BankDTO(String id, String name, String branch, String ifsc) {
	
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.ifsc = ifsc;
  }


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getBranch() {
	return branch;
}


public void setBranch(String branch) {
	this.branch = branch;
}


public String getIfsc() {
	return ifsc;
}


public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}


  
  
}
