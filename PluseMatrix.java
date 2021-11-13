class PluseMatrix {

	
	void plusematrix() {
	int n =5;
	
	for(int row = 1; row <= n*2-1 ;row++)
	{
		if (row == n)
			for (int col = 1; col <= n; col++)

			{
				if (row == col)
					System.out.print(n);
				System.out.print("  ");

			}
		else
			for (int col = 1; col <= n * 2 - 1; col++)

			{

				System.out.print("*");

			}

		System.out.println();

	}


	}
	public static void main(String[] args) {
		
PluseMatrix mat = new PluseMatrix();
mat.plusematrix();
		
	}

}