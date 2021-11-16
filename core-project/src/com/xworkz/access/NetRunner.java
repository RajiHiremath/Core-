package com.xworkz.access;

import com.xworkz.access.restrict.Intranet;


import static com.xworkz.access.restrict.Restriction.user;

import com.xworkz.access.restrict.Extranet;
public class NetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Internet internet=new Internet();
		internet.setName("End user");
		String internetUser=internet.getName();
		System.out.println(internetUser);
		
		Intranet intranet=new Intranet();
		
		intranet.setName("Organization");
		String IntranetUser=intranet.getName();
		System.out.println(IntranetUser);
		
		
		
		Extranet extranet=new Extranet();
		extranet.setUser("vendors access to organization");
		String extranetUser=extranet.getUser();
		System.out.println(extranetUser);
		System.out.println(user);
		}

}


