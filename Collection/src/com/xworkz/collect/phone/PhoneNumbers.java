package com.xworkz.collect.phone;
import java.util.Comparator;
public class PhoneNumbers implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
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
