package com.xworkz.collect.dto.product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductDAO 
{
     private List<ProductDTO> list=new ArrayList<ProductDTO>();
     
     public ProductDAO() {
 		ProductDTO productDTO1 = new ProductDTO("0986chik", "Shampoo", 10, "Chik ");
 		ProductDTO productDTO2 = new ProductDTO("890tfgs", "cold drinks", 5, "Mazza");
 		ProductDTO productDTO3 = new ProductDTO("DAYPACKNEO15CBCRE", "Safari College Backpack", 2, "Safari");
 		ProductDTO productDTO4 = new ProductDTO("milk3456", "Dairy Milk", 20, "Cadbury");
 		ProductDTO productDTO5 = new ProductDTO("bagsskyer", "Bag", 6, "Sky bags");
 		ProductDTO productDTO6 = new ProductDTO("chair05set", "Chair", 14, "Ninga");
 		ProductDTO productDTO7 = new ProductDTO("Kurta456il", "Dress", 25, "Lylar");
 		ProductDTO productDTO8 = new ProductDTO("woods345tg", "flywood", 20, "GreenPly Industries Ltd");
 		ProductDTO productDTO9 = new ProductDTO("paragon778", "footware", 2, "Paragon");
 		ProductDTO productDTO10 = new ProductDTO("pencil586", "pencil", 50, "Hindustan Pencils");

 		this.list.add(productDTO1);
 		this.list.add(productDTO2);
 		this.list.add(productDTO3);
 		this.list.add(productDTO4);
 		this.list.add(productDTO5);
 		this.list.add(productDTO6);
 		this.list.add(productDTO7);
 		this.list.add(productDTO8);
 		this.list.add(productDTO9);
 		this.list.add(productDTO10);
 		

 	}
 	public ProductDTO find(Product match, ProductDTO dtoCompare) {
 		Iterator<ProductDTO> itr = this.list.iterator();
 		while(itr.hasNext())
 		{
 			ProductDTO value=itr.next();
 		
 		
 		System.out.println("using forEach method");
 		list.forEach((ele) -> {System.out.println(ele);
 		});
 		
 			ProductDTO temp = match.evaluate(value, dtoCompare);
 			if (temp != null) 
 			{
 				return temp;
 			}

 		}
 		return null;
 		}
 	}
