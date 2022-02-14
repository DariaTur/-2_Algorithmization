package by.epam.training.module2;
//Сформировать квадратную матрицу порядка n по заданному образцу(n-чётное).

public class Task15 {
	
	public static void printMatrix(int n) {
		int[][] nums = new int[n][n];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				if((i<=j && i<=n-1-j) || (i>=j && i<=n-1-j)) {
					nums[i][j] = i+1;
				}
				else {
					nums[i][j] = 0;
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
