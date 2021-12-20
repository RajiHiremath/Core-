package com.xworkz.collect.dto.loop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex 
{
	public static void main(String[] args) {
	
		int airQuality1=100;
		int airQuality2=125;
		int airQuality3=147;
		int airQuality4=150;
		int airQuality5=163;
		int airQuality6=176;
		int airQuality7=234;
		int airQuality8=245;
		int airQuality9=269;
		int airQuality10=287;
		int airQuality11=298;
		int airQuality12=311;
		int airQuality13=343;
		int airQuality14=356;
		int airQuality15=368;
		int airQuality16=386;
		int airQuality17=405;
		int airQuality18=439;
		int airQuality19=456;
		int airQuality20=487;
		//ascending order of airQuality <150
		Stream<Integer> stream = Stream.of(airQuality1, airQuality2, airQuality3, airQuality4, airQuality5, airQuality6,
				airQuality7, airQuality8, airQuality9, airQuality10, airQuality11, airQuality12, airQuality13, airQuality14, airQuality15,
				airQuality16, airQuality17, airQuality18, airQuality19, airQuality20);
		List<Integer> ref = stream.filter((e) -> e < 150).collect(Collectors.toList());
		ref.forEach(e -> System.out.println("air quality index:" + e));
		System.err.println("////////////////////");
		System.err.println("descending order");

		//descending order of air quality
		Stream<Integer> stream1 = Stream.of(airQuality1, airQuality2, airQuality3, airQuality4, airQuality5, airQuality6,
				airQuality7, airQuality8, airQuality9, airQuality10, airQuality11, airQuality12, airQuality13, airQuality14, airQuality15,
				airQuality16, airQuality17, airQuality18, airQuality19, airQuality20);

		List<Integer> integers = stream1.sorted((f1, f2) -> f2.compareTo(f1)).collect(Collectors.toList());
		integers.forEach(e -> System.out.println(e));

		//ascending order of air quality
		Stream<Integer> stream2 = Stream.of(airQuality1, airQuality2, airQuality3, airQuality4, airQuality5, airQuality6,
				airQuality7, airQuality8, airQuality9, airQuality10, airQuality11, airQuality12, airQuality13, airQuality14, airQuality15,
				airQuality16, airQuality17, airQuality18, airQuality19, airQuality20);
		System.err.println("////////////////////");
		System.err.println("ascending order");
		List<Integer> integers1= stream2.sorted().collect(Collectors.toList());
		integers1.forEach(e -> System.out.println(e));
		
	}
}

