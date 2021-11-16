package com.xworkz.dp;
import com.xworkz.dp.dto.DressCodeDTO;
import com.xworkz.dp.dao.DressCodeDAO;
public class DressCodeStarter {

	public static void main(String[] args) {
		 
 DressCodeDTO dressCodedto=new DressCodeDTO("small","cotton","pink",200,'f');
 DressCodeDTO dressCodedto1=new DressCodeDTO("medium","wool","purple",250,'f');
 DressCodeDTO dressCodedto2=new DressCodeDTO("small","nylon","black",300,'m');
 DressCodeDTO dressCodedto3=new DressCodeDTO("large","cotton","brown",500,'f');
 DressCodeDTO dressCodedto4=new DressCodeDTO("extra large","silk","white",900,'f');
	
 DressCodeDAO ref=new DressCodeDAO();
 ref.saveDetails(dressCodedto2);
 ref.saveDetails(dressCodedto1);
 
 DressCodeDTO[] ref1=ref.getDressCodeDTOs();
 for(int count=0;count<ref1.length;count++)
   {
	 DressCodeDTO ref2=ref1[count];
	 if(ref2!=null)
	 {
	 System.out.println(ref2.getSize());
	 System.out.println(ref2.getMaterial());
	 System.out.println(ref2.getColour());
	 System.out.println(ref2.getPrice());
	 System.out.println(ref2.getGender());
	}
	 else
	 {
     System.err.println("Reference 2 is pointing to null :" .concat(String.valueOf(count)));
     }
	 //ref.delete(0);
	 //ref.displayDetails();
	 
	 //ref.update(dressCodedto1, 1);
	 //ref.displayDetails();
	 
  }
	}
}