package com.xworkz.collect.dto.loop.stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PresidentDTOScammer {

	public static void main(String[] args) {
    List<PresidentDTO> list =new ArrayList<PresidentDTO>();
    PresidentDTO presidentDTO1=new PresidentDTO("PN01","Rajendra Prasad","India","13 May 1952 –13 May 1957");
	PresidentDTO presidentDTO2=new PresidentDTO("PN02","Sarvepalli Radhakrishnan","India","13 May 1962 – 13 May 1967");
	PresidentDTO presidentDTO3=new PresidentDTO("PN03","Zakir Hussain","India","13 May 1967 – 3 May 1969");
	PresidentDTO presidentDTO4=new PresidentDTO("PN04","John Admas","America","March 4 1797-March 4, 1801");
	PresidentDTO presidentDTO5=new PresidentDTO("PN05","James Madison","America","04 March 1807 - 04 March 1817");
	
	List<String> temp1 = Stream.of(presidentDTO1, presidentDTO2, presidentDTO3, presidentDTO4, presidentDTO5)
			.map((e) -> e.getTenure()).collect(Collectors.toList());
	temp1.forEach((e) -> System.out.println("Tenure of president is:" + e));

	System.err.println("/////////////////////");
	
	List<String> temp3=Stream.of(presidentDTO1, presidentDTO2, presidentDTO3, presidentDTO4, presidentDTO5)
			.sorted().max(Comparator.).collect(Collectors.toList());

	List<String> temp2 = Stream.of(presidentDTO1, presidentDTO2, presidentDTO3, presidentDTO4, presidentDTO5)
			.map((e) -> e.getName()).collect(Collectors.toList());
	temp2.forEach((e) -> System.out.println("president Name :" + e));

	System.err.println("/////////////////////");
	List<PresidentDTO> president = new ArrayList<PresidentDTO>();

	president.add(presidentDTO1);
	president.add(presidentDTO2);
	president.add(presidentDTO3);
	president.add(presidentDTO4);
	president.add(presidentDTO5);

	Iterator<PresidentDTO> itr = president.iterator();
	while (itr.hasNext()) {
		PresidentDTO element = itr.next();
		System.out.println(element);
	}
  }
}