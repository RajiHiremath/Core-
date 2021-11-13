class IncreaseTriangle {

	void increaseTriangleMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {

				System.out.print(row);

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		IncreaseTriangle matrix = new IncreaseTriangle();

		matrix.increaseTriangleMatrix();

	}

}