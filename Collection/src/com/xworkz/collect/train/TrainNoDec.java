package com.xworkz.collect.train;

import java.util.Comparator;

public class TrainNoDec implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1,Integer o2) 
	{
		if(o1.equals(o2))
		{
			System.out.println("two objects are equal");
		}
		if(o2>o1)
		{
			System.out.println("o2 is greater than the o1");
		}
		if(o2<o1)
		{
			System.out.println("o2 is lesser than the o1");
		}
		return 0;
	}

}
