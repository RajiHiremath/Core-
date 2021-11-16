package com.xworkz.crud;

public class RocketStarter {
public static void main(String[] args) {
	  Rocket rocket=new Rocket();
	  String name=rocket.getName();
	  System.out.println(name);
	  String type=rocket.getType();
	  System.out.println(type);
	  String speed=rocket.getSpeed();
      System.out.println(speed);
      
     rocket.addName("Chandrayana 2");
     rocket.addType("solid");
     rocket.addSpeed("16m/s");
     
     rocket.addName("GS AT");
     rocket.addType("solid");
     rocket.addSpeed("8.9m/s");
     
     rocket.addName("Cartosat");
     rocket.addType("liquid");
     rocket.addSpeed("11m/s");
     
     rocket.addName("Risat");
     rocket.addType("plasma");
     rocket.addSpeed("7.9m/s");
      
     rocket.addName("CMS");
     rocket.addType("solid");
     rocket.addSpeed("13.2m/s");
     
     rocket.displayRocket();
     
     


}

}

