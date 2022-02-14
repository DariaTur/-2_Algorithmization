package by.epam.training.module2;
//Сформировать квадратную матрицу порядка n по заданному образцу(n-чётное).

public class Task14 {
	public static void printMatrix(int n) {
		int[][] nums = new int[n][n];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				if(i%2==0) {
					nums[i][j] = j+1; 
				}
				else {
					nums[i][j] = n - j;
				}
			}
		}
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
			System.out.print(nums[i][j]+" ");
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 6;
		if(n%2==0) {
			printMatrix(n);
		}else {
			System.out.print("n должно быть чётным!");
		}
		

	}

}
