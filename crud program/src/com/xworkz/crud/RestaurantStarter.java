package com.xworkz.crud;

public class RestaurantStarter {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant("veg","A/C rooms");
		String type=restaurant.getType();
		System.out.println(type);
		String facility=restaurant.getFacility();
		System.out.println(facility);
		
		restaurant.addType("Veg and Non veg");
		restaurant.addType("Non veg");
		restaurant.addType("Veg ");
		restaurant.addType("Veg");
		restaurant.addType("Chinese and Non veg");
		restaurant.addFacility("A/C");
		restaurant.addFacility("Non A/C");
		restaurant.addFacility("Non A/C");
		restaurant.addFacility("A/C");
		restaurant.addFacility("Non A/C");
		restaurant.displayRestaurant();
	}

}
