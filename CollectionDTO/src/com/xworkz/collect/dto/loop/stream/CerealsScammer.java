package com.xworkz.collect.dto.loop.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CerealsScammer {

	public static void main(String[] args) {
		
		Collection<String> collects=new ArrayList<String>();
		String name1="Wheat";
		String name2="Oats";
		String name3="Bulgur";
		String name4="Barley";
		String name5="Rice";
		
		Stream<String> cereals = Stream.of("Wheat", "Oats", "Barley", "Rye", "Sorghum", "Corn", "Quinoa", "Buckwheat",
				"Millet", "Triticale", "Grape Nuts", "Peanut Butter Puff", " Flax-Chia", "Granola", "Esprit", "Carrera",
				"Popcorn", "Rice", "Bulgur", "Oatmeal");

		List<String> temp = cereals.filter((e)->e.toLowerCase()).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println(e));
		System.err.println("/////////////");
		System.err.println("ascending order");

		Stream<String> cereals1 = Stream.of("Wheat", "Oats", "Barley", "Rye", "Sorghum", "Corn", "Quinoa", "Buckwheat",
				"Millet", "Triticale", "Grape Nuts", "Peanut Butter Puff", "Flax-Chia", "Granola", "Esprit", "Carrera",
				"Popcorn", "Rice", "Bulgur", "Oatmeal");

		List<String> temp2 = cereals1.sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
		temp2.forEach((e) -> System.out.println(e));
		System.err.println("////////////////////");
		System.err.println("descending order");

		Stream<String> cereals2 = Stream.of("Wheat", "Oats", "Barley", "Rye", "Sorghum", "Corn", "Quinoa", "Buckwheat",
				"Millet", "Triticale", "Grape Nuts", "Peanut Butter Puff", "Flax-Chia", "Granola", "Esprit", "Carrera",
				"Popcorn", "Rice", "Bulgur", "Oatmeal");

		List<String> temp1 = cereals2.sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println(e));

	}
	}

