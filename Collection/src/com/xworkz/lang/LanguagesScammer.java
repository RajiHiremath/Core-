package com.xworkz.lang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LanguagesScammer {
   public static void main(String[] args) {
	
	    String langName1="Chinese";
		String langName2="Spanish";
		String langName3="English";
		String langName4="Arabic";
		String langName5="Hindi";
		String langName6="Bengali";
		String langName7="Italian";
		String langName8="French";
		String langName9="Russian";
		String langName10="Japanese";
		String langName11="Maliyalam";
		String langName12="Tamil";
		String langName13="Telugu";
		String langName14="Marathi";
		String langName15="Korean";
		String langName16="Kannada";
		String langName17="Portugese";
		String langName18="Urdu";
		String langName19="Javanese";
		String langName20="Lahnda";
		String langName21="Vietnamese";
		String langName22="Khoisan";
		String langName23="Kirundi";
		String langName24="Tigrinya";
		String langName25="	Sesotho";
		String langName26="Nyanja";
		String langName27="Malagasy";
		String langName28="Bhojpuri";
		String langName29="Somali";
		String langName30="Romani";
		String langName31="Sindhi";
		String langName32="Tatar";
		String langName33="Tijrigna";
		String langName34="Ukrainian";
		String langName35="Vietnmase";
		String langName36="Xhosa";
		String langName37="Yucatec";
		String langName38="Albanian";
		String langName39="Bashkort";
		String langName40="Bulgerian";
		String langName41="Cebuano";
		String langName42="Czech";
		String langName43="Dholuo";
		String langName44="Estonian";
		String langName45="Georgian";
		String langName46="Guarani";
		String langName47="Hawiian";
		String langName48="Basque";
		String langName49="Amharic";
		String langName50="Bislama";
		String langName51="Tatar";
		String langName52="Sesotho";
		String langName53="Xhosa";
		String langName54="Dholuo";
		String langName55="Romani";
		String langName56="Vietnmase";
		String langName57="Nyanja";
		String langName58="Lahnda";
		String langName59="yucatec";
		String langName60="Urdu";
		
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(langName1);
		collection.add(langName2);
		collection.add(langName3);
		collection.add(langName4);
		collection.add(langName5);
		collection.add(langName6);
		collection.add(langName7);
		collection.add(langName8);
		collection.add(langName9);
		collection.add(langName10);
		collection.add(langName11);
		collection.add(langName12);
		collection.add(langName13);
		collection.add(langName14);
		collection.add(langName15);
		collection.add(langName16);
		collection.add(langName17);
		collection.add(langName18);
		collection.add(langName19);
		collection.add(langName20);
		collection.add(langName21);
		collection.add(langName22);
		collection.add(langName23);
		collection.add(langName24);
		collection.add(langName25);
		collection.add(langName26);
		collection.add(langName27);
		collection.add(langName28);
		collection.add(langName29);
		collection.add(langName30);
		collection.add(langName31);
		collection.add(langName32);
		collection.add(langName33);
		collection.add(langName34);
		collection.add(langName35);
		collection.add(langName36);
		collection.add(langName37);
		collection.add(langName38);
		collection.add(langName39);
		collection.add(langName40);
		collection.add(langName41);
		collection.add(langName42);
		collection.add(langName43);
		collection.add(langName44);
		collection.add(langName45);
		collection.add(langName46);
		collection.add(langName47);
		collection.add(langName48);
		collection.add(langName49);
		collection.add(langName50);
		collection.add(langName51);
		collection.add(langName52);
		collection.add(langName53);
		collection.add(langName54);
		collection.add(langName55);
		collection.add(langName56);
		collection.add(langName57);
		collection.add(langName58);
		collection.add(langName59);
		collection.add(langName60);
	
		
		System.out.println(collection);
		System.out.println("Number of Lang Name added :" +collection.size());
		
		Iterator<String> itr = collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		boolean check1 = collection.remove(langName58);
		System.out.println(check1);

		boolean checkout = collection.contains(langName58);
		System.out.println(checkout);

		boolean contained = collection.isEmpty();
		System.out.println(contained);

		collection.clear();
		System.err.println("cleared");
}
}
