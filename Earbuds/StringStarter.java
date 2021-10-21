package core.xworkz.earbuds;

public class StringStarter {

	public static void main(String[] args) {
		
		String noise="Noise";
		String boat=new String("boat");
		if (noise ==boat)
		{
			System.out.println("String are pointing to same memory");
		}
		else
		{
			System.out.println("String are pointing to different memory");
		}
		String boat1="boat";
		
		if (boat ==boat1)
		{
			System.out.println("String are pointing to same memory");
		}
		else
		{
			System.out.println("String are pointing to different memory");
		}
		boat1="Cherry";
		System.out.println(boat1);
		boat1="Masala Papad";
		System.out.println(boat1);
		boat1=boat;
		System.out.println(boat1);
		
		if(boat1==boat)
		{
			System.out.println("boat and boat1 are pointing to same memory");
		}
		else 
		{
			System.out.println("boat and boat1 are pointing to different memory");
		}
	}
}
