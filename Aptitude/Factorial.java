 class Factorial
{
    public static void main(String[] args)
    {
		Factorial facto=new Factorial();
		facto.printUsingForLoop();
		facto.printUsingWhileLoop();
		facto.printUsingDoWhileLoop();
		
	}
	
	public void printUsingWhileLoop()
	{
		int num = 6;
        long fac = 1;
        int x=1;
        
        while (x <= num);
        {
            fac = fac * x;
            x++;
        }
        System.out.println("Factorial of " + num + " is: " + fac);
	}
	  
public void printUsingForLoop()
{
	int i,z=1;  
  int num=5;
  
  for(i=1;i<=num;i++){    
      z=z*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+z);    
 }	
 
 public void printUsingDoWhileLoop()
 {
	 int num = 6;
        long fac = 1;
        int i = 1;
        
        do
        {
            fac = fac * i;
            i++;
        } while (i <= num);

        System.out.println("Factorial of " + num + " is: " + fac);
 }
 
 }
