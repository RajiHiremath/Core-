package com.xworkz.entity.dao;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.FlightEntity;

public class FlightImplementation implements FlightInterface{
	@Override
	public void save(FlightEntity entity) {
	System.out.println("invoked the entity:"+entity);
	
	Configuration configuration=new Configuration();
	configuration.configure();
	
	}
}