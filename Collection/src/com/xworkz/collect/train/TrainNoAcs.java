package com.xworkz.collect.train;
import java.util.Comparator;
public class TrainNoAcs implements Comparator<Integer>
{
    @Override
	public int compare(Integer o1, Integer o2) {
		if(o1.equals(o2))
		{
			System.out.println("two objects are equal");
		}
		if(o1>o2)
		{
			System.out.println("o1 is greater than o2");
			
		}
		if(o1 < o2)
		{
			System.out.println("o1 is lesser than o2");
		}
		return 0;
	}
}
