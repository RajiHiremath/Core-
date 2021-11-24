package com.xworkz.airport.dao;

public interface AirportDAO 
{
	boolean save(AirportDTO airportdto);
	AirportDTO findByName(String name);
	default void displayAirportDetails() {
	}
}
