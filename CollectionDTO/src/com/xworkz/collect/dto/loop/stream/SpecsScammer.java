package com.xworkz.collect.dto.loop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecsScammer {

	public static void main(String[] args) {
		
		String name1="CK Jeans";
		String name2="Dior";
		String name3="Fendi";
		String name4="Nike";
		String name5="Carrera";
		
		System.err.println("ascending order");

		Stream<String> specs1 = Stream.of("Ray-Ban", "Fastrack", "IDEE", "Polaroid", "Vogue", "Police", "Prada",
				"Oakley", "Lapectus", "Gucci", "CK Jeans", "Image", "Scott", "Lacoste", "Esprit", "Carrera", "Coach",
				"Fendi", "Nike", "Dior");

		List<String> temp2 = specs1.sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
		temp2.forEach((e) -> System.out.println(e));
		System.err.println("/////////////////");
		System.err.println("descending order");

		Stream<String> specs2 = Stream.of("Ray-Ban", "Fastrack", "IDEE", "Polaroid", "Vogue", "Police", "Prada",
				"Oakley", "Lapectus", "Gucci", "CK Jeans", "Image", "Scott", "Lacoste", "Esprit", "Carrera", "Coach",
				"Fendi", "Nike", "Dior");

		List<String> temp1 = specs2.sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println(e));

	}

	}


