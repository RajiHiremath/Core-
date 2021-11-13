class DecreaseStarMatrix {
	
	void DecreaseTriangleMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		
		DecreaseStarMatrix matrix=new DecreaseStarMatrix();
		matrix.DecreaseTriangleMatrix();
	}

}