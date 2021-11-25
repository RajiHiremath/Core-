package com.xworkz.bird.dao;
import com.xworkz.bird.dto.BirdDTO;
public interface Birds 
{
   boolean save(BirdDTO birdDTO);
   BirdDTO findByBreedName(String name);
	default void displayBirdsDetails() 
	{
		
	}
}
