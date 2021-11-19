class Fibbonacci
{
 public static void main (String [] args)
 {
 Fibbonacci fibbonacci=new Fibbonacci();
 fibbonacci.printUsingWhileLoop();
}


 void printUsingWhileLoop()
 {
  int total;
  int num1=0 ,num2=1;
  int index=1;
  while(index <=20)
  {
   System.out.print(num1 + " ");
   total=num1 +num2;
   num1=num2;
   num2=total;
   index++;
  }
 
 }
}