class DecreaseMatrix {

	void DecreaseTriangleMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {

				System.out.print(col);//(row)

			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		DecreaseMatrix matrix = new DecreaseMatrix();
		matrix.DecreaseTriangleMatrix();
		
	}

}