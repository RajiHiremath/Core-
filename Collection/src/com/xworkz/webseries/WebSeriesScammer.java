package com.xworkz.webseries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WebSeriesScammer {

	public static void main(String[] args) {
		
		String webSeries1="Money Heist";
		String webSeries2="Titans";
		String webSeries3="Inside Edge";
		String webSeries4="Lost in space";
		String webSeries5="Hicups and hookups";
		String webSeries6="Howkeye";
		String webSeries7="Coyboy bebop";
		String webSeries8="The wheel of time";
		String webSeries9="Star trek";
		String webSeries10="The special ops";
		String webSeries11="The agents are here";
		String webSeries12="Succession";
		String webSeries13="Little things";
		String webSeries14="House of secret";
		String webSeries15="Break point";
		String webSeries16="Foundation";
		String webSeries17="Kotafactory";
		String webSeries18="Star wars vision";
		String webSeries19="Squid game";
		String webSeries20="The last man";
		String webSeries21="Mombay diaries";
		String webSeries22="The emperie season";
		String webSeries23="What if";
		String webSeries24="Feels like ishq";
		String webSeries25="Ted lasso";
		String webSeries26="Never have i ever";
		String webSeries27="ray";
		String webSeries28="Loki";
		String webSeries29="The family man";
		String webSeries30="Out of love";
		String webSeries31="the big day";
		String webSeries32="Ok computer";
		String webSeries33="The falcon and winter soldier";
		String webSeries34="Bombay begums";
		String webSeries35="The married women";
		String webSeries36="Tandav";
		String webSeries37="Wanda vision";
		String webSeries38="The witcher";
		String webSeries39="Mis Matched";
		String webSeries40="The dark materials";
		String webSeries41="Breaking Bad";
		String webSeries42="Games of thrones";
		String webSeries43="Mirjapur";
		String webSeries44="The boys";
		String webSeries45="DareDevil";
		String webSeries46="The walking dead";
		String webSeries47="Sacred Games ";
		String webSeries48="Afsos";
		String webSeries49="Chernobyl";
		String webSeries50="Breathe";
		String webSeries51="Dexter";
		String webSeries52="Bates Motel ";
		String webSeries53="Euphoria";
		String webSeries54="Killing Eve";
		String webSeries55="Six Feet Under";
		String webSeries56="Doom Patrol";
		String webSeries57="Chilling Adventures of Sabrina";
		String webSeries58="Hannibal";
		String webSeries59="Fargo";
		String webSeries60="Fearless";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(webSeries1);
		collection.add(webSeries2);
		collection.add(webSeries3);
		collection.add(webSeries4);
		collection.add(webSeries5);
		collection.add(webSeries6);
		collection.add(webSeries7);
		collection.add(webSeries8);
		collection.add(webSeries9);
		collection.add(webSeries10);
		collection.add(webSeries11);
		collection.add(webSeries12);
		collection.add(webSeries13);
		collection.add(webSeries14);
		collection.add(webSeries15);
		collection.add(webSeries16);
		collection.add(webSeries17);
		collection.add(webSeries18);
		collection.add(webSeries19);
		collection.add(webSeries20);
		collection.add(webSeries21);
		collection.add(webSeries22);
		collection.add(webSeries23);
		collection.add(webSeries24);
		collection.add(webSeries25);
		collection.add(webSeries26);
		collection.add(webSeries27);
		collection.add(webSeries28);
		collection.add(webSeries29);
		collection.add(webSeries30);
		collection.add(webSeries31);
		collection.add(webSeries32);
		collection.add(webSeries33);
		collection.add(webSeries34);
		collection.add(webSeries35);
		collection.add(webSeries36);
		collection.add(webSeries37);
		collection.add(webSeries38);
		collection.add(webSeries39);
		collection.add(webSeries40);
		collection.add(webSeries41);
		collection.add(webSeries42);
		collection.add(webSeries43);
		collection.add(webSeries44);
		collection.add(webSeries45);
		collection.add(webSeries46);
		collection.add(webSeries47);
		collection.add(webSeries48);
		collection.add(webSeries49);
		collection.add(webSeries50);
		collection.add(webSeries51);
		collection.add(webSeries52);
		collection.add(webSeries53);
		collection.add(webSeries54);
		collection.add(webSeries55);
		collection.add(webSeries56);
		collection.add(webSeries57);
		collection.add(webSeries58);
		collection.add(webSeries59);
		collection.add(webSeries60);
		
		
		System.out.println(collection);
	    System.out.println("Number of Web Series added :" + collection.size());
	    
	    Iterator<String> itr =collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		boolean checks = collection.remove(webSeries53);
		System.out.println(checks);

		boolean checked = collection.contains(webSeries53);
		System.out.println(checked);

		boolean contains = collection.isEmpty();
		System.out.println(contains);

		collection.clear();
		System.err.println("collection is cleared");
		
	}

}
