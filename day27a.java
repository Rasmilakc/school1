package test4;

public class day27a {

	public static void main(String[] args) {
		//1.Define multidimensional array and loop using for each
		int[][] marks = new int[3][4];
		marks[0][0] = 1;
		marks[0][1] = 2;
		marks[0][2] = 3;
		marks[0][3] = 4;

		marks[1][0] = 11;
		marks[1][1] = 22;
		marks[1][2] = 33;
		marks[1][3] = 44;

		marks[2][0] = 55;
		marks[2][1] = 66;
		marks[2][2] = 77;
		marks[2][3] = 88;
		System.out.println(marks[1][2]);
		
		//loop for each
		for (int[] row : marks) {
			for (int col : row) {
				System.out.println(col);
		
			}
		}
		
	
	}

			
	
}