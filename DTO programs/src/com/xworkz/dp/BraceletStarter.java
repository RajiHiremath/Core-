package com.xworkz.dp;

public class BraceletStarter {

	public static void main(String[] args) {
		Bracelet bracelet=new Bracelet();
		bracelet.setColour("yellow");
		bracelet.setMaterial("gold");
		bracelet.setGemUsed(false);
		bracelet.setGifted(true);
		bracelet.setPrice(200);
		bracelet.setWeight(150.0f);
		
		Bracelet bracelet1=new Bracelet("silver","white",false,true,200,300.0f);
		Bracelet bracelet2=new Bracelet("diamond","white",true,false,7000,500.0f);
		Bracelet bracelet3=new Bracelet("gold","pista",false,true,2000,30.0f);
		Bracelet bracelet4=new Bracelet("silver","black",true,false,400,25.0f);
		Bracelet bracelet5=new Bracelet("silver","grey",true,true,700,32.0f);
		
		Bracelet[] ref= new Bracelet[5];
		ref[3]=bracelet;
		ref[1]=bracelet5;
		ref[0]=bracelet2;
		ref[4]=bracelet1;
		ref[2]=bracelet4;
		for(int a=0;a<ref.length;a++)
		{
		   Bracelet fig =ref[a];
		   if(fig!=null)
		   {
		   System.out.println(fig.getColour());
		   System.out.println(fig.getMaterial());
		   System.out.println(fig.getPrice());
		   System.out.println(fig.getWeight());
		   System.out.println(fig.isGemUsed());
		   System.out.println(fig.isGifted());
		   }
		   else
		   {
			   System.err.println("fig is null".concat(String.valueOf(a)));
		   }
		}
	}
}
