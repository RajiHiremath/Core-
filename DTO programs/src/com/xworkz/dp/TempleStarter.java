package com.xworkz.dp;
import com.xworkz.dp.dao.TempleDAO;
import com.xworkz.dp.dto.TempleDTO;

public class TempleStarter {

public static void main(String[] args) {
  TempleDTO templeDTO=new TempleDTO("Shri Ganesh","C.B.S Circle","ganesh",true,5);
  TempleDTO templeDTO1=new TempleDTO("Shri Gowri","Gandhi Circle","Gowri",true,3);
  TempleDTO templeDTO2=new TempleDTO("Shri Durgadevi","Islampur","Durgadevi",true,7);
  TempleDTO templeDTO3=new TempleDTO("Shri Channabasava tata","C.B.S Circle","Channabasava",true,5);
  TempleDTO templeDTO4=new TempleDTO("Shri Murugamath","Mahaveer circle","Atani murugesh",true,15);
	
  
 TempleDAO templeDAO=new TempleDAO();
templeDAO.save(templeDTO4);
templeDAO.save(templeDTO2);
templeDAO.save(templeDTO1);
templeDAO.save(templeDTO3);

TempleDTO[] ref=templeDAO.getTempleDTOs();
for(int count=0;count<ref.length;count++)
{
	TempleDTO ref1=ref[count];
	if(ref1!=null)
	{
	System.out.println(ref1.getName());
	System.out.println(ref1.getLocation());
	System.out.println(ref1.getMainGod());
	System.out.println(ref1.isPrasad());
	System.out.println(ref1.getYestGante());
	}
	else
	{
		System.err.println("Refence is pointing to null :" .concat(String.valueOf(count)));
	}
 }
templeDAO.delete(1);
templeDAO.displayDetails();
}
}
