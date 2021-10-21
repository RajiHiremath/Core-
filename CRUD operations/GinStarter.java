package com.xworkz.crud;

public class GinStarter {

	public static void main(String[] args) {
		Gin gin=new Gin("green","Jaisamar");
		String scolour=gin.getColour();
		System.out.println(scolour);
		String sbrand=gin.getBrand();
        System.out.println(sbrand);
        
        gin.addColour("sky blue");
        gin.addColour("white");
        gin.addColour("pink");
        gin.addColour("yellow");
        gin.addColour("red");
        gin.addColour("light green");
        gin.addBrand("Hendricks");
        gin.addBrand("Beefeater");
        gin.addBrand("Botanest");
        gin.addBrand("Silpsismit");
        gin.addBrand("Ginmare");
        gin.addBrand("Bombay sappchi");
        gin.displayGin();
	}

}