package com.xworkz.collect.phone;
import java.util.Comparator;
public class PhoneNumbersDec implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) 
	{
		if(o1.equals(o2))
		{
			System.out.println("two objects are equal");
		}
		if(o2 > o1)
		{
			System.out.println("o2 is greater than o1");
		}
		if(o2 < o1)
		{
			System.out.println("o2 is lesser than o1");
		}
		return 0;
	}

}
