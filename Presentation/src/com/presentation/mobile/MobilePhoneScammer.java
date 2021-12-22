package com.presentation.mobile;

public class MobilePhoneScammer {

	public static void main(String[] args) {
		
		MobilePhone mobile= new MobilePhone();//default

		MobilePhone mobile1=new MobilePhone("vivo");
		System.out.println(mobile1.brand);
		MobilePhone mobile2=new MobilePhone("vivo", "black");
		System.out.println(mobile2.brand);
		System.out.println(mobile2.color);
		MobilePhone mobile3=new MobilePhone("vivo", "black", 18000);
		System.out.println(mobile3.brand);
		System.out.println(mobile3.color);
		System.out.println(mobile3.price);
	}

}
