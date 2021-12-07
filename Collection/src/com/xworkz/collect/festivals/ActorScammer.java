package com.xworkz.collect.festivals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorScammer {

	public static void main(String[] args) {
		
		String actorName1="Puneeth Raj Kumar";
		String actorName2="Shiva Raj Kumar";
		String actorName3="Ragavendra Raj Kumar";
		String actorName4="Yuva Raj kumar";
		String actorName5="Soudraya";
		String actorName6="Kalpana";
		String actorName7="Bhavana";
		String actorName8="Darshan";
		String actorName9="Vinod Prabhakar";
		String actorName10="Ramesh Arvind";
		String actorName11="Ramesh Bhat";
		String actorName12="Yogaraj Bhat";
		String actorName13="Raj Kumar";
		String actorName14="Ramya";
		String actorName15="Rakshita";
		String actorName16="Milana";
		String actorName17="Darling Krishna";
		String actorName18="Upendra";
		String actorName19="Sudeep";
		String actorName20="Yogi";
		String actorName21="Ganesh";
		String actorName22="Anat Nag";
		String actorName23="Shankar Nag";
		String actorName24="Vishnuvardhan";
		String actorName25="Prabhakar";
		String actorName26="Jaggesh";
		String actorName27="Rakshit Shetty";
		String actorName28="Prakash raj";
		String actorName29="Diganth";
		String actorName30="Chiru Sarja";
		String actorName31="Dhruva Sarja";
		String actorName32="Meghana Raj";
		String actorName33="Jayanti";
		String actorName34="Madhuri";
		String actorName35="Sadhu Kokila";
		String actorName36="Prem";
		String actorName37="Rajinikant";
		String actorName38="Arjun Sarja";
		String actorName39="Kamal Hassan";
		String actorName40="Sunil Shetty";
		String actorName41="Ravi Chandra";
		String actorName42="Shruti";
		String actorName43="Rachita Ram";
		String actorName44="Aarathi";
		String actorName45="Ambika";
		String actorName46="Amulya";
		String actorName47="Aindritha Ray";
		String actorName48="Bharati";
		String actorName49="Lakshmi";
		String actorName50="Prema";
		String actorName51="Sudha Rani";
		String actorName52="Parvati";
		String actorName53="Shilpa Shetty";
		String actorName54="Parul Yadav";
		String actorName55="Harshika";
		String actorName56="Dhananjay";
		String actorName57="Ragini";
		String actorName58="Rashmika";
		String actorName59="Anupama";
		String actorName60="Advi Sesh";
		
		Collection<String> collection=new ArrayList <String>();
		
		collection.add(actorName1);
		collection.add(actorName2);
		collection.add(actorName3);
		collection.add(actorName4);
		collection.add(actorName5);
		collection.add(actorName6);
		collection.add(actorName7);
		collection.add(actorName8);
		collection.add(actorName9);
		collection.add(actorName10);
		collection.add(actorName11);
		collection.add(actorName12);
		collection.add(actorName13);
		collection.add(actorName14);
		collection.add(actorName15);
		collection.add(actorName16);
		collection.add(actorName17);
		collection.add(actorName18);
		collection.add(actorName19);
		collection.add(actorName20);
		collection.add(actorName21);
		collection.add(actorName22);
		collection.add(actorName23);
		collection.add(actorName24);
		collection.add(actorName25);
		collection.add(actorName26);
		collection.add(actorName27);
		collection.add(actorName28);
		collection.add(actorName29);
		collection.add(actorName30);
		collection.add(actorName31);
		collection.add(actorName32);
		collection.add(actorName33);
		collection.add(actorName34);
		collection.add(actorName35);
		collection.add(actorName36);
		collection.add(actorName37);
		collection.add(actorName38);
		collection.add(actorName39);
		collection.add(actorName40);
		collection.add(actorName41);
		collection.add(actorName42);
		collection.add(actorName43);
		collection.add(actorName44);
		collection.add(actorName45);
		collection.add(actorName46);
		collection.add(actorName47);
		collection.add(actorName48);
		collection.add(actorName49);
		collection.add(actorName50);
		collection.add(actorName51);
		collection.add(actorName52);
		collection.add(actorName53);
		collection.add(actorName54);
		collection.add(actorName55);
		collection.add(actorName56);
		collection.add(actorName57);
		collection.add(actorName58);
		collection.add(actorName59);
		collection.add(actorName60);
		
		
		System.out.println(collection);
		System.out.println("Number of Actor Name added :" + collection.size());
		
		 Iterator<String> itr =collection.iterator();

	 		boolean check = itr.hasNext();
	 		System.out.println(check);

	 		while (itr.hasNext()) 
	 		{
	 			System.out.println(itr.next());
	 		}

	 		boolean checks = collection.remove(actorName60);
	 		System.out.println(checks);

	 		boolean checked = collection.contains(actorName60);
	 		System.out.println(checked);

	 		boolean contains = collection.isEmpty();
	 		System.out.println(contains);

	 		collection.clear();
	 		System.err.println("collection is cleared"); 

	}

}
