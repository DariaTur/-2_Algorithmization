package by.epam.training.module2;
//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task20 {
	
	public static void print(int[][] nums) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i][i]>0) {
				System.out.println(nums[i][i]);
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{12,-23,45},{34,1,2}};
		print(a);

	}

}
