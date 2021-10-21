package core.xworkz.core;

public class ArrayStarter {

	public static void main(String[] args) {
		String manju="KA 37 M 3535";
		String praneet="KA 23 F 7676";
		String purvik="KA 16 S 9090";
		String[] vehicleNos=new String[4];
		vehicleNos[3]=manju;
		vehicleNos[1]=praneet;
		vehicleNos[0]=purvik;
		for(int i=0;i<vehicleNos.length;i++)
		{
			System.out.println(i);
			String temp=vehicleNos[1];
			if(temp!=null)
			{
				temp=temp.toLowerCase();
				System.out.println(temp);
			}
			else
			{
				System.out.println(temp);
			}
		}
		
	}

}
