package com.healthedge.interview;

public class MaxCoin {
	
	public MaxCoin(){};

	public  int maxSumOfCoin(int[][] matrix) {

		try {
			if (matrix == null || matrix.length==0)
				return 0;

			int row = matrix.length;
			int col = matrix[1].length;

			matrix[0][0] = matrix[0][0];
			for (int c = 1; c < col; c++)
				matrix[0][c] = matrix[0][c - 1] + matrix[0][c];
			for (int r = 1; r < row; r++)
				matrix[r][0] = matrix[r - 1][0] + matrix[r][0];

			for (int r = 1; r < row; r++)
				for (int c = 1; c < col; c++)
					matrix[r][c] += Math.max(matrix[r - 1][c], matrix[r][c - 1]);

			return matrix[row - 1][col - 1];

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

}
