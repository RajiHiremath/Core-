package com.exam;

import java.math.BigInteger;

public class BigProblem {

	public static void main(String[] args) {
		BigInteger fiveThousand=new BigInteger("5000");
		BigInteger fiftyThousand= new BigInteger("50000");
		BigInteger fiveHunderedThousand =new BigInteger("500000");
		BigInteger Total = BigInteger.ZERO;
		Total.add(fiveThousand);
		Total.add(fiftyThousand);
		Total.add(fiveHunderedThousand);
		System.out.println(Total);
	}

}
