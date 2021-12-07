package com.xworkz.lipstick;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class LipStickScammer {

	public static void main(String[] args) {
		
		String lipStick1="Lovebug";
		String lipStick2="Night crimson";
		String lipStick3="Electric pink";
		String lipStick4="Lovely lips";
		String lipStick5="Fruity funnel";
		String lipStick6="Dazzing deva";
		String lipStick7="Lippy land";
		String lipStick8="LipStick lab";
		String lipStick9="LipStick Guru";
		String lipStick10="Devini LipStick";
		String lipStick11="Luscious Lips";
		String lipStick12="Cupids Lips";
		String lipStick13="Lemon drop";
		String lipStick14="Rockins red";
		String lipStick15="Lip candy store";
		String lipStick16="The lip Gloss shop";
		String lipStick17="Lappial LipStick";
		String lipStick18="Gorgeous Lipstick";
		String lipStick19="Frost Lipstick";
		String lipStick20="Lip butter";
		String lipStick21="Purple mocha madness";
		String lipStick22="Cherry bomb";
		String lipStick23="Passion fruit";
		String lipStick24="Peach poppin";
		String lipStick25="Lipcious";
		String lipStick26="Makeup deva";
		String lipStick27="Velvet vexin";
		String lipStick28="Hot cheeks";
		String lipStick29="sweet and sassy";
		String lipStick30="Fabolous Lipstick";
		String lipStick31="Lip gloss bars";
		String lipStick32="ultra rich lips";
		String lipStick33="Adose of color";
		String lipStick34="Rougi queen";
		String lipStick35="Touch of color";
		String lipStick36="All the rage";
		String lipStick37="Angel pink";
		String lipStick38="alluring";
		String lipStick39="Lipstick vixcn";
		String lipStick40="Tint your lips";
		String lipStick41="stiletto Lips";
		String lipStick42="Fatal Spark";
		String lipStick43="Black rose";
		String lipStick44="dare wear";
		String lipStick45="Original pink";
		String lipStick46="Bitten berry";
		String lipStick47="pink passion";
		String lipStick48="cherry picking";
		String lipStick49="color pop";
		String lipStick50="Stay sweet";
		String lipStick51="stiletto Lips";
		String lipStick52="Black rose";
		String lipStick53="Rougi queen";
		String lipStick54="cherry picking";
		String lipStick55="Fatal Spark";
		String lipStick56="Bitten berry";
		String lipStick57="Angel pink";
		String lipStick58="Lipstick vixcn";
		String lipStick59="Lip gloss bars";
		String lipStick60="Touch of color";
		
		
	Collection<String> collection=new ArrayList<String>();
		
		
		collection.add(lipStick1);
		collection.add(lipStick2);
		collection.add(lipStick3);
		collection.add(lipStick4);
		collection.add(lipStick5);
		collection.add(lipStick6);
		collection.add(lipStick7);
		collection.add(lipStick8);
		collection.add(lipStick9);
		collection.add(lipStick10);
		collection.add(lipStick11);
		collection.add(lipStick12);
		collection.add(lipStick13);
		collection.add(lipStick14);
		collection.add(lipStick15);
		collection.add(lipStick16);
		collection.add(lipStick17);
		collection.add(lipStick18);
		collection.add(lipStick19);
		collection.add(lipStick20);
		collection.add(lipStick21);
		collection.add(lipStick22);
		collection.add(lipStick23);
		collection.add(lipStick24);
		collection.add(lipStick25);
		collection.add(lipStick26);
		collection.add(lipStick27);
		collection.add(lipStick28);
		collection.add(lipStick29);
		collection.add(lipStick30);
		collection.add(lipStick31);
		collection.add(lipStick32);
		collection.add(lipStick33);
		collection.add(lipStick34);
		collection.add(lipStick35);
		collection.add(lipStick36);
		collection.add(lipStick37);
		collection.add(lipStick38);
		collection.add(lipStick39);
		collection.add(lipStick40);
		collection.add(lipStick41);
		collection.add(lipStick42);
		collection.add(lipStick43);
		collection.add(lipStick44);
		collection.add(lipStick45);
		collection.add(lipStick46);
		collection.add(lipStick47);
		collection.add(lipStick48);
		collection.add(lipStick49);
		collection.add(lipStick50);
		collection.add(lipStick51);
		collection.add(lipStick52);
		collection.add(lipStick53);
		collection.add(lipStick54);
		collection.add(lipStick55);
		collection.add(lipStick56);
		collection.add(lipStick57);
		collection.add(lipStick58);
		collection.add(lipStick59);
		collection.add(lipStick60);
		
		System.out.println(collection);
	    System.out.println("Number of lipStick added :" + collection.size());
	    
	    Iterator<String> itr =collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		boolean checks = collection.remove(lipStick45);
		System.out.println(checks);

		boolean checked = collection.contains(lipStick45);
		System.out.println(checked);

		boolean contains = collection.isEmpty();
		System.out.println(contains);

		collection.clear();
		System.err.println("collection is cleared");


  }

}
