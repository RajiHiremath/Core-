package com.xworkz.collect.dto.loop.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SatelliteScammer {

	public static void main(String[] args) {
		
		String Satellite1="PSLC c1";
		String Satellite2="Aryabhata";
		String Satellite3="Bhaskara-I";
		String Satellite4="Rohini RS-1";
		String Satellite5="Rohini RS-D1";
		String Satellite6="Bhaskara-II";
		
		Stream<String> stream=Stream.of("PSLC c1","INSAT-1A","Aryabhata","SROSS-1","Bhaskara-II","Rohini RS-D1",
				                        "Rohini RS-1","IRS-1A","SROSS-2","INSAT-1C","IRS-1B","INSAT-2A","IRS-1E",
				                        "INSAT-2C","IRS-P4 OCEANSAT","INSAT-3B","GSAT-1","INSAT-3C","Kalpana-1","EDUSAT");
		System.err.println("descending order");
		List<String> string = stream.sorted((f1, f2) -> f2.compareTo(f1)).collect(Collectors.toList());
		string.forEach(e -> System.out.println(e));
		
		Stream<String> stream1=Stream.of("PSLC c1","INSAT-1A","Aryabhata","SROSS-1","Bhaskara-II","Rohini RS-D1",
                "Rohini RS-1","IRS-1A","SROSS-2","INSAT-1C","IRS-1B","INSAT-2A","IRS-1E",
                "INSAT-2C","IRS-P4 OCEANSAT","INSAT-3B","GSAT-1","INSAT-3C","Kalpana-1","EDUSAT");
		System.err.println("////////////////////");
		System.err.println("ascending order");
		List<String> string1= stream1.sorted().collect(Collectors.toList());
		string1.forEach(e -> System.out.println(e));
	}

}
