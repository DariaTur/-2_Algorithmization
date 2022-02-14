package by.epam.training.module2;
//Дана квадратная матрицв. Вывести на экран элементы, стоящие на диагонали.

public class Task12 {
	
	public static void print(int[][] nums) {
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i][i]);	
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{12,23,45},{34,1,2}};
		print(a);

	}

}
