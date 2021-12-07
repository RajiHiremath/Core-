package com.xworkz.bikes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class BikesScammer {

	public static void main(String[] args) {
		
		String bike1="Jawa";
		String bike2="Hero";
		String bike3="Hero honda";
		String bike4="TVS";
		String bike5="Indian motor cycle";
		String bike6="Royal enfield";
		String bike7="Mahendra";
		String bike8="Suzuki";
		String bike9="SF moto";
		String bike10="Kawasaki";
		String bike11="Ducati";
		String bike12="Moto guzzi";
		String bike13="Active";
		String bike14="Aprilia";
		String bike15="Yukie";
		String bike16="Yezdi";
		String bike17="Techo Electra";
		String bike18="Switch bike";
		String bike19="Super eco";
		String bike20="Duke";
		String bike21="Apache";
		String bike22="Bajaj Pulsar";
		String bike23="Hero Splender +";
		String bike24="TVS excel";
		String bike25="Bounce infinity even";
		String bike26="Hero electric flash";
		String bike27="TVS jupiter";
		String bike28="Yamaha YZF";
		String bike29="Honda Hness";
		String bike30="Active 6G";
		String bike31="KTM 390";
		String bike32="hero x-pulse";
		String bike33="Passion pro";
		String bike34="Audi A$";
		String bike35="Aerox 155";
		String bike36="Beneli brings";
		String bike37="Pulsar";
		String bike38="Ampere magnus";
		String bike39="Komaki x-GtKm";
		String bike40="Yamaha FZS";
		String bike41="R15 v3";
		String bike42="Jupiter";
		String bike43="Access 125";
		String bike44="Activa 125";
		String bike45="Interceptor 650";
		String bike46="Continental GT 650";
		String bike47="Classic 350";
		String bike48="Meteor 390";
		String bike49="bullet 320";
		String bike50="RE 650";
		String bike51="Beneli brings";
		String bike52="Komaki x-GtKm";
		String bike53="KTM 390";
		String bike54="R15 v3";
		String bike55="Bajaj Pulsar";
		String bike56="TVS excel";
		String bike57="Yamaha FZS";
		String bike58="Yukie";
		String bike59="TVS";
		String bike60="hero x-pulse";
		
		
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		collection.add(bike19);
		collection.add(bike20);
		collection.add(bike21);
		collection.add(bike22);
		collection.add(bike23);
		collection.add(bike24);
		collection.add(bike25);
		collection.add(bike26);
		collection.add(bike27);
		collection.add(bike28);
		collection.add(bike29);
		collection.add(bike30);
		collection.add(bike31);
		collection.add(bike32);
		collection.add(bike33);
		collection.add(bike34);
		collection.add(bike35);
		collection.add(bike36);
		collection.add(bike37);
		collection.add(bike38);
		collection.add(bike39);
		collection.add(bike40);
		collection.add(bike41);
		collection.add(bike42);
		collection.add(bike43);
		collection.add(bike44);
		collection.add(bike45);
		collection.add(bike46);
		collection.add(bike47);
		collection.add(bike48);
		collection.add(bike49);
		collection.add(bike50);
		collection.add(bike51);
		collection.add(bike52);
		collection.add(bike53);
		collection.add(bike54);
		collection.add(bike55);
		collection.add(bike56);
		collection.add(bike57);
		collection.add(bike58);
		collection.add(bike59);
		collection.add(bike60);
		
		
		System.out.println(collection);
	    System.out.println("Number of bikes added :" + collection.size());
	    
	    Iterator<String> itr =collection.iterator();

	  		boolean check = itr.hasNext();
	  		System.out.println(check);

	  		while (itr.hasNext()) 
	  		{
	  			System.out.println(itr.next());
	  		}

	  		boolean checks = collection.remove(bike60);
	  		System.out.println(checks);

	  		boolean checked = collection.contains(bike60);
	  		System.out.println(checked);

	  		boolean contains = collection.isEmpty();
	  		System.out.println(contains);

	  		collection.clear();
	  		System.err.println("collection is cleared"); 
	    
	}
}
