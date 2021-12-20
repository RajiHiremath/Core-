package com.xworkz.collect.dto.loop.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportScammer {

	public static void main(String[] args) {
		
		  String name1="Chhatrapati Shivaji International Airport";
		  String name2="Kempegowda International Airport";
		  String name3="Chennai International Airport";
		  String name5="Netaji Subhas Chandra Bose International Airport";
		  String name6="Visakhapatnam International Airport";
		  String name7="Kannur International Airport";
		  
Stream<String> stream=Stream.of("Visakhapatnam International Airport","Kannur International Airport","Chennai International Airport","Kempegowda International Airport","Chhatrapati Shivaji International Airport",
				 "Netaji Subhas Chandra Bose International Airport","Sri Guru Ram Dass Jee International Airport","Surat International Airport","Devi Ahilya Bai Holkar Airport",
				 "Cochin International Airport","Indira Gandhi International Airport","Dabolim Airp","Pune Airport","Coimbatore International Airport","Calicut International Airport",
				 "Madurai Airport","Chandigarh International Airport","Mangalore International Airport","Jaipur International Airport","Imphal International Airport");

	System.err.println("descending order");
    List<String> string = stream.sorted((f1, f2) -> f2.compareTo(f1)).collect(Collectors.toList());
    string.forEach(e -> System.out.println(e));
			
Stream<String> stream1=Stream.of("Visakhapatnam International Airport","Kannur International Airport","Chennai International Airport","Kempegowda International Airport","Chhatrapati Shivaji International Airport",
        "Netaji Subhas Chandra Bose International Airport","Sri Guru Ram Dass Jee International Airport","Surat International Airport","Devi Ahilya Bai Holkar Airport",
        "Cochin International Airport","Indira Gandhi International Airport","Dabolim Airp","Pune Airport","Coimbatore International Airport","Calicut International Airport",
        "Madurai Airport","Chandigarh International Airport","Mangalore International Airport","Jaipur International Airport","Imphal International Airport");

   System.err.println("////////////////////");
   System.err.println("ascending order");
   List<String> string1= stream1.sorted().collect(Collectors.toList());
   string1.forEach(e -> System.out.println(e));
   
 Stream<String> stream2=Stream.of("Visakhapatnam International Airport","Kannur International Airport","Chennai International Airport","Kempegowda International Airport","Chhatrapati Shivaji International Airport",
	        "Netaji Subhas Chandra Bose International Airport","Sri Guru Ram Dass Jee International Airport","Surat International Airport","Devi Ahilya Bai Holkar Airport",
	        "Cochin International Airport","Indira Gandhi International Airport","Dabolim Airp","Pune Airport","Coimbatore International Airport","Calicut International Airport",
	        "Madurai Airport","Chandigarh International Airport","Mangalore International Airport","Jaipur International Airport","Imphal International Airport");
   
   System.err.println("///////////////////");
   System.err.println("Airport names starts with S");
   List<String> string2=stream2.filter((e) -> e.startsWith("S")).collect(Collectors.toList());
   string2.forEach((e) -> System.out.println(e));
   
   Stream<String> stream3=Stream.of("Visakhapatnam International Airport","Kannur International Airport","Chennai International Airport","Kempegowda International Airport","Chhatrapati Shivaji International Airport",
	        "Netaji Subhas Chandra Bose International Airport","Sri Guru Ram Dass Jee International Airport","Surat International Airport","Devi Ahilya Bai Holkar Airport",
	        "Cochin International Airport","Indira Gandhi International Airport","Dabolim Airp","Pune Airport","Coimbatore International Airport","Calicut International Airport",
	        "Madurai Airport","Chandigarh International Airport","Mangalore International Airport","Jaipur International Airport","Imphal International Airport");
   
   System.out.println("//////////////////////");
   System.out.println("lower cases of Airport name");
   List<String> string3=stream3.filter((e) ->e.toLowerCase()).collect(Collectors.toList());
	string3.forEach((e)-> System.out.println(e));
   
  }
	}

