class NaturalNumber 
{ 
	public static void main(String [] args)   
		{ 
          NaturalNumber num=new NaturalNumber();
		  num.printUsingForLoop();
		  num.printUsingDoWhileLoop();
		  num.printUsingWhileLoop();
		}		
		
		
		public void printUsingForLoop()
		{
			int n=20;  
		    System.out.print(n);  
		  for (int i=1; i<=n; i++)   
		  {  
		    System.out.print(i);  
		  }
         System.out.println("");		
		}  
		
		
		public void printUsingDoWhileLoop()
		{
		int i=0;    
	    do{    
	        System.out.print(i);    
	        i++;    
	      }while(i<=30); 
         System.out.println("");		  
		}
		
		public void printUsingWhileLoop()
		{
		   int a = 1;
	        int b = 0;
	        while (a <= 50) {
	            System.out.print(a);
	           b = b + a;
	           a = a + 1;
	        }
	      
	    }
		
		}  
		
		