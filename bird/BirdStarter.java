package com.xworkz.bird;
import com.xworkz.bird.dto.BirdBird;
import com.xworkz.bird.dto.BirdDTO;
public class BirdStarter {

	public static void main(String[] args) 
	{
		BirdDTO birdDTOs = new BirdDTO("TD 342",15,"Finch",true);
		BirdBird dto1 = new BirdBird();
		dto1.save(birdDTOs);
        dto1.saveBird(new BirdDTO());

		 BirdDTO ref1= dto1.findByBreedName("Cockatiel");
		System.out.println(ref1);
		
		BirdBird birds=new BirdBird();
		System.out.println(birds.save(birdDTOs));
		System.out.println(birds.findByBreedName("Finch"));
		birds.displayBirdsDetails();


	}

}
