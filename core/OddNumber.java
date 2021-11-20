class OddNumber
{
	   public static void main(String[]args)
	   {
		   OddNumber odd=new OddNumber();
		   odd.printUsingForLoop();
		   odd.printUsingWhileLoop();
		   odd.printUsingDoWhileLoop();
		   
	   }
	   public void printUsingForLoop()
	   {
		   int n=20;
          for(int i=1; i<=n; i++)
	      {
		   if(i%2!=0)
		   {
		   System.out.print(i + "");	
		   }
		  }
		  System.out.println("");
	   }
	   public void printUsingWhileLoop()
	   {
		   int n=0;
		  while(n<=20)
		{
		if(n%2!=0)
		{
			
		System.out.print(n +"");  
	   }
	   n++;
	    } 
		System.out.println("");
	 }
	 
	 public void printUsingDoWhileLoop()
	 {
		 int n=0;
		 do{
		   if(n%2==1)
		  {
			System.out.print(n+ "");
		  }
		   n++;
	     }
	  while(n<=20);
		System.out.println(""); 
	 }
}     
	 
	  
   
    
   
   