package com.xworkz.classes;

public class WrapperClass {

	public static void main(String[] args) {
		
		String name="Xworkz";
		boolean contain=name.contains("rk");
		System.out.println(contain);
		
		char[] chars= {'R','A','J','U'};
		String convertedString=String.copyValueOf(chars);
		System.out.println(convertedString);
		
		String branch=new String ("GANGAVATI");
		boolean containsAN=branch.contains("AN");
		System.out.println(containsAN);
		
		String speech="care";
		String concat="care".concat("less");
		System.out.println(concat);
		
		String looking="cutte";
		String replace="cutte".replace('e','s');
		System.out.println(replace);
		
		String palaceName="Mysore Palace";
		boolean endWith=palaceName.endsWith("a");
		System.out.println(endWith);
		
		String city="BanGaloRE";
		String toUpperCase=city.toUpperCase();
		System.out.println(toUpperCase);
		
		String city1="BanGaloRE";
		String toLowerCase=city1.toLowerCase();
		System.out.println(toLowerCase);
		
		String address="Gangavati is famous for rice paddy";
		int length=address.length();
		System.out.println(length);
		
		String description="Have a nice day";
		String trim=description.trim();
		System.out.println(trim);
		
		String plant="Cactus";
		boolean contentEquals=plant.contentEquals("Cactus");
		System.out.println(contentEquals);
		
		String festival="Udagi";
		String substring=festival.substring(1);
		System.out.println(substring);
		
		String game="hidden World";
		boolean endsWith=game.endsWith("ld");
		System.out.println(endsWith);

		
		
		
		
		
		
	}

}
