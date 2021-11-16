package core.xworkz.nailpaint;

public class NailTrimmerStarter {

	public static void main(String[] args) {
//Integer        
		int shoeSize=9;
		Integer chappalSize=9;
	    int i=chappalSize.intValue();
		System.out.println(i);
		System.out.println(chappalSize.getClass().getName());
		
		int ticket=10;
		Integer ticketNumber=11;
     	ticketNumber=ticketNumber.hashCode();
     	System.out.println(ticketNumber);
     	
     	int cost=10;
     	Integer bookCost=35;
     	Integer bookCost1=36;
     	bookCost=bookCost1.compareTo(bookCost);
     	System.out.println(bookCost);
     	
     	int price=15;
     	Integer banglePrice=50;
     	System.out.println(banglePrice.SIZE);
     	System.out.println(banglePrice.getClass().getName());
     	
     	double bag=5d;
     	Integer bag1=200;
     	double d=bag1.doubleValue();
     	System.out.println(d);
     	
     	long bin=9L;
     	Integer bin1=500;
     	long L=bin1.longValue();
     	System.out.println(L);
     	
        byte pin=1;
        Integer pinCost=50;
        System.out.println(pinCost.byteValue());
        System.out.println(pinCost.getClass().getName());
     	
     	String name="Shailaja";
     	Integer fj=87;
     	String sd=fj.toString();
     	System.out.println(sd);
     	System.out.println(sd.getClass().getName());
     	
     	Integer zz=9;
     	String aa=zz.toBinaryString(zz);
     	System.out.println(aa);
//Float     	
     	Float ff=1.0f;
     	String abc=ff.toHexString(ff);
     	System.out.println(abc);
     	
     	Float num1=1.2f;
     	Float num2=1.2f;
     	boolean set=num1.equals(num2);
     	System.out.println(set);
     	System.out.println(num1.getClass().getName());
     	
     	Float weight=1.2f;
     	Float weight1=2.22f;
     	int state=weight1.compareTo(weight);
     	System.out.println(state);
     	System.out.println(weight.getClass().getName());
     	
     	Float height1=0.0f;
     	float hh=height1.MAX_VALUE;
     	System.out.println(hh);
     	System.out.println(height1.getClass().getName());
     	
     	Float a=1.2f;
     	Float b=2.2f;
     	float stat=Float.sum(a,b);
     	System.out.println(stat);
     	System.out.println(b.getClass().getName());
//Short     	
     	Short ss=22;
     	String xyz=ss.toString(ss);
     	System.out.println(xyz);
     	
     	Short num=100;
     	Short num3=100;
     	boolean sett=num.equals(num3);
     	System.out.println(sett);
     	System.out.println(num.getClass().getName());
     	
     	Short weight11=35;
     	Short weight12=37;
     	int states=weight11.compareTo(weight12);
     	System.out.println(states);
     	System.out.println(weight11.getClass().getName());
     	
     	Short height11=23;
     	float hhz=height11.MAX_VALUE;
     	System.out.println(hhz);
     	System.out.println(height11.getClass().getName());
     	
     	Short aaa=55;
     	Short bb=1;
     	short statz=Short.reverseBytes(bb);
     	System.out.println(statz);
     	System.out.println(b.getClass().getName());
//Long     	
     	Long lenght=20l;
     	int ii=lenght.bitCount(lenght);
     	System.out.println(ii);
     	System.out.println(lenght.getClass().getName());
     	
     	Long size=77l;
     	Long size1=79l;
     	int xx=Long.compareUnsigned(size,size1);
     	System.out.println(xx);
     	
     	Long divident=99l;
     	Long divider=3l;
        long x=Long.divideUnsigned(99l,3l);
        System.out.println(x);
        
        int wird=3;
        Long resize=56l;
        String unsigned=resize.toUnsignedString(56l,3);
        System.out.println(unsigned.getClass().getName());
     	System.out.println(unsigned);
     	
     	Long order=1l;
     	long yy=order.highestOneBit(44);
     	System.out.println(yy);
//Boolean     	
     	Boolean run=true;
     	Boolean rin=false;
     	System.out.println(run.booleanValue());
     	System.out.println(run.equals(rin));
     	System.out.println(run.compareTo(rin));
     	System.out.println(run.getBoolean("true"));
     	System.out.println(run.logicalAnd(run,rin));
     	
//Character
     	Character[] put={'S','a','r'};
     	Character durt='P';
     	Character putty='m';
     	System.out.println(put.length);
     	String fan=put.toString();
     	System.out.println(fan);
     	System.out.println(putty.forDigit(5,9));
     	System.out.println(putty.toUpperCase('m'));
     	System.out.println(durt.toLowerCase('P'));
//Byte
     	Byte burn=2;
     	Byte burn1=10;
     	String bit="s";
     	System.out.println(burn.BYTES);
     	System.out.println(burn1.describeConstable());
     	System.out.println(burn.);
     	
     	
     	
     	
     	
     	
     	
     	
     	
     			
     	
     	
     	
     	
     	
     	
     	
     }
}
