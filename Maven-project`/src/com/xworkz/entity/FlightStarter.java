package com.xworkz.entity;

import com.xworkz.entity.dao.FlightImplementation;
import com.xworkz.entity.dao.FlightInterface;

public class FlightStarter {
	public static void main(String[] args) {

		FlightInterface flightEntity=new FlightImplementation();
		flightEntity.save(new FlightEntity());
	}

}


