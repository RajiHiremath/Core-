package core.xworkz.core;

public class MondayStarter {

	public static void main(String[] args) {
		long shaila=9483764424L;
		long mahesh=9483764414L;
		long veeresh=9483764433L;
		long raju=8050058473L;
		
		long[] phoneNos={shaila,mahesh,veeresh,raju,9480674372L};
		phoneNos[1]=7204735375L;
		long index4=phoneNos[4];
		System.out.println(index4);
		for(int no=0;no<phoneNos.length;no++)
		{
			System.out.println(no);
			long ph=phoneNos[no];
			System.out.println(ph);
		}
	}

}
