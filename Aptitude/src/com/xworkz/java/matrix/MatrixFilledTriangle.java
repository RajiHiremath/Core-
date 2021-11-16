package com.xworkz.java.matrix;

public class MatrixFilledTriangle {
 public static void main(String[] args) {
	for(int row=1;row<6;row++)
	{
		for(int colum=1;colum<6;colum++) 
		{
			if(row == colum)
			{
				System.out.print("*");
			}
			else if(row>=colum)
			{
				System.out.print("*");
			}
			else if(row==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("");
			}
			System.out.println("");
		}
} 
 }
}
