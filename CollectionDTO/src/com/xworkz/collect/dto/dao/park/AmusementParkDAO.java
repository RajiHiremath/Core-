package com.xworkz.collect.dto.dao.park;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AmusementParkDAO 
{
    private List<AmusementParkDTO> list=new ArrayList<AmusementParkDTO>();
    
    public AmusementParkDAO() {

    	AmusementParkDTO parkDTO1=new AmusementParkDTO("Wonderla",2200,true,true);
    	AmusementParkDTO parkDTO2=new AmusementParkDTO("Fun world",1200,true,false);
    	AmusementParkDTO parkDTO3=new AmusementParkDTO("Thunder",1500,false,true);
    	AmusementParkDTO parkDTO4=new AmusementParkDTO("GRS",1900,true,false);
    	
    	this.list.add(parkDTO4);
    	this.list.add(parkDTO1);
    	this.list.add(parkDTO2);
    	this.list.add(parkDTO3);
  }
    
    	public AmusementParkDTO Find(AmusementPark dto,AmusementParkDTO dtotoCompare)
    	{
    			Iterator<AmusementParkDTO> itr=this.list.iterator();
        		while(itr.hasNext())
        		{
        			AmusementParkDTO element=itr.next();
        			AmusementParkDTO temp=dto.match(element, dtotoCompare);
        			if(temp!=null)
        			{
        				return element;
        			}
        		}
    		
    		
    	return null;
    	
	}
		
}
