package com.xworkz.collect.festivals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FestivalScammer {

public static void main(String[] args) {
		
String name1="Dasara",name2="Deepavali",name3="Divali",name4="udagi",name5="Sankranti",
	  name6="NarakaChaturdarshi",name7="Christmas",name8="New Year",name9="RakshaBandana",
	  name10="Nagara Panchami",name11="Ganesh Habba",name12="Gowri Habba",name13="Holi",
	  name14="Durga Pooje",name15="Krihna Janmastami",name16="Shivratri",name17="Onam",name18="Baisakhi",
	  name19="Gurpurab",name20="Good Friday",name21="Easter",name22="Karva Chauth",name23="Varamahalaxmi",
	  name24="Pongal",name25="Bihu",name26="Bhudha Poornima",name27="Basava Jayanti",
	  name28="Independence Day",name29="Republic Day",name30="KanakaDas Jayanti",
	  name31="Dr.B.R. Ambedkar Jayanti",name32="Children's Day",name33="Teacher's Day",
	  name34="Engineer's Day",name35="Guru poornima",name36="Guru nanak Jayanti",name37="Bhaidooj",
	  name38="Kannada Rajyostava",name39="Rama Navami",name40="Hanuma Jayanti",
	  name41="Vasanta Panchami",name42="Lohri",name43="Gudipadwia",name44="Mahaveer Jayanti",
	  name45="Karthika Deepam",name46="Chatrapati Shivaji Jayanti",name47="Kumbhmela",
	  name48="Losar",name49="Bhudha Jayanti",name50="Rathayatra",name51="Hornbill",
	  name52="Bhishma ekadasi",name53="Bakrid",name54="Ramzan",name55="Eid",name56="Moharam",
	  name57="Yellu Amavase",name58="Khar Hunnime",name59="Bhimana Amavase",name60="Hiriyara pooje";
		
      Collection<String> collection=new ArrayList <String>();
		
		collection.add(name1);
		collection.add(name2);
		collection.add(name3);
		collection.add(name4);
		collection.add(name5);
		collection.add(name6);
		collection.add(name7);
		collection.add(name8);
		collection.add(name9);
		collection.add(name10);
		collection.add(name11);
		collection.add(name12);
		collection.add(name13);
		collection.add(name14);
		collection.add(name15);
		collection.add(name16);
		collection.add(name17);
		collection.add(name18);
		collection.add(name19);
		collection.add(name20);
		collection.add(name21);
		collection.add(name22);
		collection.add(name23);
		collection.add(name24);
		collection.add(name25);
		collection.add(name26);
		collection.add(name27);
		collection.add(name28);
		collection.add(name29);
		collection.add(name30);
		collection.add(name31);
		collection.add(name32);
		collection.add(name33);
		collection.add(name34);
		collection.add(name35);
		collection.add(name36);
		collection.add(name37);
		collection.add(name38);
		collection.add(name39);
		collection.add(name40);
		collection.add(name41);
		collection.add(name42);
		collection.add(name43);
		collection.add(name44);
		collection.add(name45);
		collection.add(name46);
		collection.add(name47);
		collection.add(name48);
		collection.add(name49);
		collection.add(name50);
		collection.add(name51);
		collection.add(name52);
		collection.add(name53);
		collection.add(name54);
		collection.add(name55);
		collection.add(name56);
		collection.add(name57);
		collection.add(name58);
		collection.add(name59);
		collection.add(name60);
		
		System.out.println(collection);
		System.out.println("Number of festival added :" +collection.size());
		
		Iterator<String> itr =collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		boolean checks = collection.remove(name17);
		System.out.println(checks);

		boolean checked = collection.contains(name17);
		System.out.println(checked);

		boolean contains = collection.isEmpty();
		System.out.println(contains);

		collection.clear();
		System.err.println("collection is cleared");
	}
}
