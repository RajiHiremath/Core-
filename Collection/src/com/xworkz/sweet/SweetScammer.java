package com.xworkz.sweet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class SweetScammer {

	public static void main(String[] args) {
		
		String sweet1="Kaju katli";
		String sweet2="Kotichur";
		String sweet3="Ghee Motichur";
		String sweet4="Besan laddu";
		String sweet5="Dry fruit Burfi";
		String sweet6="Kaju anar";
		String sweet7="Kaju kismiss";
		String sweet8="kaju pan";
		String sweet9="kaju masala";
		String sweet10="White kalakand";
		String sweet11="Kunda";
		String sweet12="Jamoon";
		String sweet13="Dry jamoon";
		String sweet14="Rasgulla";
		String sweet15="Rusmallai";
		String sweet16="Doodh pedha";
		String sweet17="M sikka";
		String sweet18="Chocolate cake";
		String sweet19="Ghee gever";
		String sweet20="Kaju anjur burfi";
		String sweet21="Kandi pedha";
		String sweet22="Dharwad pedha";
		String sweet23="Green burfi";
		String sweet24="Orange burfi";
		String sweet25="White burfi";
		String sweet26="Mysore pak";
		String sweet27="Ghee mysorepak";
		String sweet28="Dink laddu";
		String sweet29="Ghee soan papdi";
		String sweet30="Milk soan papdi";
		String sweet31="Orange soan papdi";
		String sweet32="Chocolate soan papdi";
		String sweet33="Besan soan papdi";
		String sweet34="Coconut soan papdi";
		String sweet35="Kardantu";
		String sweet36="Dry fruit halwa";
		String sweet37="Banana Halwa";
		String sweet38="Pista Halwa";
		String sweet39="Badam Halwa";
		String sweet40="Pineapple Halwa";
		String sweet41="Chandrakala";
		String sweet42="Mandige";
		String sweet43="Champakali";
		String sweet44="Lal pedha";
		String sweet45="Gokak kardant";
		String sweet46="Bhoondi";
		String sweet47="Cham cham";
		String sweet48="Kesar pedha";
		String sweet49="Mava pedha";
		String sweet50="Kaju Anjeer roll";
		String sweet51="Kaju pista roll";
		String sweet52="kaju modak";
		String sweet53="Coconut burfi";
		String sweet54="Mathura doodh pedha";
		String sweet55="jelebi";
		String sweet56="jahangir";
		String sweet57="pene";
		String sweet58="White kaladant";
		String sweet59="khowva";
		String sweet60="Kaju anjur burfi";
		
		
		Collection<String> collection=new ArrayList<String>();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		collection.add(sweet14);
		collection.add(sweet15);
		collection.add(sweet16);
		collection.add(sweet17);
		collection.add(sweet18);
		collection.add(sweet19);
		collection.add(sweet20);
		collection.add(sweet21);
		collection.add(sweet22);
		collection.add(sweet23);
		collection.add(sweet24);
		collection.add(sweet25);
		collection.add(sweet26);
		collection.add(sweet27);
		collection.add(sweet28);
		collection.add(sweet29);
		collection.add(sweet30);
		collection.add(sweet31);
		collection.add(sweet32);
		collection.add(sweet33);
		collection.add(sweet34);
		collection.add(sweet35);
		collection.add(sweet36);
		collection.add(sweet37);
		collection.add(sweet38);
		collection.add(sweet39);
		collection.add(sweet40);
		collection.add(sweet41);
		collection.add(sweet42);
		collection.add(sweet43);
		collection.add(sweet44);
		collection.add(sweet45);
		collection.add(sweet46);
		collection.add(sweet47);
		collection.add(sweet48);
		collection.add(sweet49);
		collection.add(sweet50);
		collection.add(sweet51);
		collection.add(sweet52);
		collection.add(sweet53);
		collection.add(sweet54);
		collection.add(sweet55);
		collection.add(sweet56);
		collection.add(sweet57);
		collection.add(sweet58);
		collection.add(sweet59);
		collection.add(sweet60);
		
		System.out.println(collection);
		System.out.println("Number of sweets names added :" + collection.size());
		
		Iterator<String> itr =collection.iterator();

  		boolean check = itr.hasNext();
  		System.out.println(check);

  		while (itr.hasNext()) 
  		{
  			System.out.println(itr.next());
  		}

  		boolean checks = collection.remove(sweet55);
  		System.out.println(checks);

  		boolean checked = collection.contains(sweet55);
  		System.out.println(checked);

  		boolean contains = collection.isEmpty();
  		System.out.println(contains);

  		collection.clear();
  		System.err.println("collection is cleared"); 

	}
}
