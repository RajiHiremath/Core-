package com.xworkz.dp.dto;

public class CarpenterStarter {

	public static void main(String[] args) {
		Carpenter carpenter=new Carpenter();
		carpenter.setName("Seema");
		carpenter.setAge(24);
		carpenter.setGender('F');
		carpenter.setHeight(5.30f);
		
		Carpenter carpenter1=new Carpenter("Rahul", 25, 'M', 4.39f);
		Carpenter carpenter2=new Carpenter("Naveen", 23, 'M', 5.39f);
		Carpenter carpenter3=new Carpenter("Shivu", 28, 'M', 4.99f);
		Carpenter carpenter4=new Carpenter("Shilpa", 21, 'F', 3.96f);
		Carpenter carpenter5=new Carpenter("Vijay", 30, 'M', 5.11f);
		
		Carpenter[] ref= new Carpenter[4];
		ref[0]=carpenter4;
		ref[2]=carpenter5;
		ref[1]=carpenter2;
		for(int appu=0;appu<ref.length;appu++)
		{
			Carpenter car=ref[appu];
			if(ref!=null)
			{
				System.out.println(car.getName());
				System.out.println(car.getAge());
				System.out.println(car.getGender());
				System.out.println(car.getHeight());
			}
			else
			{
			System.err.println("Index is null".concat(String.valueOf(appu)));
			}
		}
	}
}
