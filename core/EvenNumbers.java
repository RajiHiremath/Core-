class EvenNumbers
   {
	   public static void main(String[]args)
	   {
		 EvenNumbers even=new EvenNumbers();  
		 even.printUsingWhileLoop();  
		 even.printUsingDoWhileLoop();
		 even.printUsingForLoop();
	   }
     public void printUsingWhileLoop()
	 {
       int n=0;
        while(n<=20)
		{
		if(n%2==0)
		{
			System.out.print(n +"");  
	    }
	      n++;
	   }
	   	System.out.println("");
	 } 
	 public void printUsingDoWhileLoop()
   {
	   int i=0;
        do{
			System.out.print(i+ "");
			i+=2;
		    }
		while(i<=50);
		System.out.println("");
   }
	  
   public void printUsingForLoop()
   {
	   int n=20;
     
     for(int i=1; i<=20; i++)
	 {
		if(i%2==0)
		{
		System.out.print(i + "");	
		}
			
	 }
   }
    
 } 