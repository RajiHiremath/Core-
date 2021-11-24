package com.xworkz.bus.dao;

import com.xworkz.bus.dto.BusDTO;

public interface BusRoute 
{
  boolean save(BusDTO busdto);
  BusDTO findByDriverName(String driverName);
   default void displayBusesDetails() { 
} 
}
