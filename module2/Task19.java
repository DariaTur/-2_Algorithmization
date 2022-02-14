package by.epam.training.module2;
/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, 
какой столбец содержит макс сумму.*/ 

public class Task19 {
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static int[] countSum(int[][] nums) {
		int[] sum = new int[nums.length];
		for(int j = 0; j<nums[0].length;j++) {
			for(int i = 0; i<nums.length;i++) {
				sum[i]+=nums[i][j];
			}	
		}
		return sum;
	}
	
	public static int findMax(int[] nums) {
		int indMax = 0;
		int max = nums[0];
		for(int i = 1; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				indMax = i;
			}
		}
		return indMax;
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{12,23},{4,1}};
		System.out.println("Исходная матрица:");
		printMatrix(a);
		System.out.println("Столбец с максимальной суммой:");
		System.out.println(findMax(countSum(a)));

	}

}
