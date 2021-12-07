package com.xworkz.car;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CarScammer {

	public static void main(String[] args) {
		
		String carName1 = "Eleanor";
		String carName2 = "Gina ";
		String carName3 = "Audi A3";
		String carName4 = "Jaguar E-Pace ";
		String carName5 = "Aston Martin DB11 Coupe";
		String carName6 = "Audi A2";
		String carName7 = "Aston Martin";
		String carName8 = "Jaguar F-Type Base Convertible";
		String carName9 = "Audi A5 ";
		String carName10 = "Jaguar F-2017";
		String carName11 = "Audi 255d ";
		String carName12 = " Ferrari Testarossa";
		String carName13 = " Audi 220d";
		String carName14 = "Audi 250d";
		String carName15 = "Audi A1";
		String carName16 = "Jaguar F-Type R Dynamic";
		String carName17 = "Audi A4";
		String carName18 = "Chevrolet Corvette";
		String carName19 = "volvo s60";
		String carName20 = "volvo s90";
		String carName21 = "i20";
		String carName22 = "Porsche Carrera";
		String carName23 = "Bugatti Veyron";
		String carName24 = "Tata Skoda";
		String carName25 = "Audi A6";
		String carName26 = "Dodge Viper";
		String carName27 = "Lamborghini Countach";
		String carName28 = "Audi 450d ";
		String carName29 = "Rolls-Royce Silver";
		String carName30 = " Ford Mustang ";
		String carName31 = " Desdamona";
		String carName32 = "Audi A1 2016";
		String carName33 = "Terminator";
		String carName34 = "Indestructible";
		String carName35 = "Brum";
		String carName36 = "Bumblebee";
		String carName37 = "Oatmeal";
		String carName38 = "Audi A3 201";
		String carName39 = " Bessie";
		String carName40 = "Battle Shell ";
		String carName41 = " Rascal";
		String carName42 = " Arrowcar";
		String carName43 = "Boomer Siren";
		String carName44 = "Underdog";
		String carName45 = "Turtle Taxi";
		String carName46 = "Popeye";
		String carName47 = "Guardian ";
		String carName48 = "Spit Fires";
		String carName49 = "Jitter Bug";
		String carName50 = "Enzo";
		String carName51 = " Road Sniper";
		String carName52 = "Lucky";
		String carName53 = "Robocop";
		String carName54 = " Viper ";
		String carName55 = "Rocky";
		String carName56="Oatmeal";
		String carName57="Audi A1 2016";
		String carName58="Underdog";
		String carName59="Tata Skoda";
		String carName60="volvo s90";

		Collection<String> collection = new ArrayList<String>();
		
		collection.add(carName1);
		collection.add(carName2);
		collection.add(carName3);
		collection.add(carName4);
		collection.add(carName5);
		collection.add(carName6);
		collection.add(carName7);
		collection.add(carName8);
		collection.add(carName9);
		collection.add(carName10);
		collection.add(carName11);
		collection.add(carName12);
		collection.add(carName13);
		collection.add(carName14);
		collection.add(carName15);
		collection.add(carName16);
		collection.add(carName17);
		collection.add(carName18);
		collection.add(carName19);
		collection.add(carName20);
		collection.add(carName21);
		collection.add(carName22);
		collection.add(carName23);
		collection.add(carName24);
		collection.add(carName25);
		collection.add(carName26);
		collection.add(carName27);
		collection.add(carName28);
		collection.add(carName29);
		collection.add(carName30);
		collection.add(carName31);
		collection.add(carName32);
		collection.add(carName33);
		collection.add(carName34);
		collection.add(carName35);
		collection.add(carName36);
		collection.add(carName37);
		collection.add(carName38);
		collection.add(carName39);
		collection.add(carName40);
		collection.add(carName41);
		collection.add(carName42);
		collection.add(carName43);
		collection.add(carName44);
		collection.add(carName45);
		collection.add(carName46);
		collection.add(carName47);
		collection.add(carName48);
		collection.add(carName49);
		collection.add(carName50);
		collection.add(carName51);
		collection.add(carName52);
		collection.add(carName53);
		collection.add(carName54);
		collection.add(carName55);
		collection.add(carName56);
		collection.add(carName57);
		collection.add(carName58);
		collection.add(carName59);
		collection.add(carName60);

		System.out.println(collection);
		System.out.println("Number of Car names added :" + collection.size());
		
		Iterator<String> itr =collection.iterator();

  		boolean check = itr.hasNext();
  		System.out.println(check);

  		while (itr.hasNext()) 
  		{
  			System.out.println(itr.next());
  		}

  		boolean checks = collection.remove(carName60);
  		System.out.println(checks);

  		boolean checked = collection.contains(carName60);
  		System.out.println(checked);

  		boolean contains = collection.isEmpty();
  		System.out.println(contains);

  		collection.clear();
  		System.err.println("collection is cleared"); 
     }

}
