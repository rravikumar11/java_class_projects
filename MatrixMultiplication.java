package matrixmultiplication;

import java.util.Random;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1 = gen10(10,10);
		print2D(mat1);
		//print2D(transpose(mat1));
		//print2D(mmult(mat1,transpose(mat1)));
	}
	
	public static int[][] diagonals(int[][] mat) {
		int[][] newmat = new int[mat.length+mat[0].length-1][mat[0].length];
		int newmatindex = 0;
		int newmatlen = 1;
		for (int i = mat[0].length-1; i >= 0; i--) {
			for (int j = 0; j < newmatlen; j++) {
				newmat[newmatindex][j] = mat[i][j];
			}
			newmatindex++;
		}
	}
	
	public static int[][] gen10(int row, int column) {
		Random rand = new Random();
		int[][] arr = new int[row][column];
		int fill = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				/*
				if ((i+j) % 3 == 0) {
					arr[i][j] = 0;
				}
				else if ((i+j) % 3 == 1) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = 2;
				}
				*/
				if (fill > 2) {
					fill = 0;
				}
				arr[i][j] = fill;
				fill++;
			}
		}
		return arr;
	}
	
	public static int[][] mmult(int[][] mat1, int[][] mat2) {
		
		int[][] mat3 = new int[mat1.length][mat2[0].length];
		if (mat1[0].length != mat2.length) {
			System.out.println("Error: mismatched matrices.");
			return new int[0][0];
		}
		else {
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat2[0].length; j++) {
					for (int k = 0; k < mat2.length; k++) {
						mat3[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}
			return mat3;
		}
		
	}
	
	public static int[][] transpose (int[][] mat) {
		int[][] tmat = new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < tmat.length; j++) {
				tmat[j][i] = mat[i][j];
			}
		}
		return tmat;
	}
	
	public static int[][] gen2D(int row, int column, int max) {
		Random rand = new Random();
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = rand.nextInt(max);
			}
		}
		return arr;
	}
	
	public static void print2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int val = arr[i][j];
				if (val < 10) {
					System.out.print("");
				}
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
