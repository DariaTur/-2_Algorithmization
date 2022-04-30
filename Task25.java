package by.epam.training.module2;

import java.util.Random;

/*Матрицу 10Х20 заполнить случайным образом от 0 до 15. Вывести на экран саму матрицу и 
номера строк, в которых число 5 встречается три и более раз.*/

public class Task25 {
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static void count(int[][] nums) {
		int counter;
		int[] counts = new int[20];
		
		for(int i = 0; i<nums.length; i++) {
			counter = 0;
			for(int j = 0; j<nums[i].length; j++) {
				if(nums[i][j]==5) {
					counter++;
				}
			}
			counts[i] = counter;
		}
		
		System.out.print("Номера строк, в которых число 5 встречается три и более раз: ");
		for(int i = 0; i<counts.length; i++) {
			if (counts[i]>=3) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static int[][] createMatrix() {
		int[][] nums = new int[20][10];
		Random random = new Random();

		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				nums[i][j] = random.nextInt(16);
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[][] a = createMatrix();
		System.out.println("Исходная матрица:");
		printMatrix(a);
		count(a);

	}

}
