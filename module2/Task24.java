package by.epam.training.module2;
//Найдите наибольший элемент матрицы и замените все нечётные элементы на него.

public class Task24 {
	
	public static int findMax(int[][] nums) {
		int max = nums[0][0];
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				if(nums[i][j]>max) {
					max = nums[i][j];
				}
			}
		}
		return max;
	}
	
	public static int[][] createMatrix(int[][] nums) {
		int max = findMax(nums);
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				if(nums[i][j]%2 != 0) {
					nums[i][j] = max;
				}
			}
		}
		return nums;
	}
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,3,6},{12,2,7,1},{4,1,3,5}};
		System.out.println("Исходная матрица:");
		printMatrix(a);
		System.out.println("Изменённая матрица:");
		printMatrix(createMatrix(a));

	}

}
