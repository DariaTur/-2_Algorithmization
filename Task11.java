package by.epam.training.module2;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task11 {
	
	public static void print(int[][] nums) {
		for(int i = 0; i<nums.length; i++) {
			for(int j = 1; j<nums[i].length; j+=2) {
				if(nums[0][j]>nums[nums.length-1][j]) {
					System.out.print(nums[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3,1},{3,1,2,2},{1,1,1,2},{1,1,1,1}};
		print(a);
	}

}
