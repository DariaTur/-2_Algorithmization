package by.epam.training.module2;
//Дана матрица. Вывести k-ую строку и p-ый столбец матрицы.

public class Task13 {
	
	public static void print(int[][] nums, int k, int p) {
		System.out.println("k-ая строка");
		for(int j = 0; j < nums[k].length; j++) {
			System.out.print(nums[k][j]+" ");
		}
		System.out.println();
		System.out.println("p-ый столбец");
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i][p]);
		}
	}

	public static void main(String[] args) {
		int k = 0;
		int p = 2;
		int[][] a = {{1,2,3},{12,23,45},{34,1,2}};
		if(k>=a.length||p>=a[0].length) {
			System.out.println("Неверные k, p");
		}
		else{
			print(a,k,p);
		}

	}

}
