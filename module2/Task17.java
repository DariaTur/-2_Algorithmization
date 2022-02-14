package by.epam.training.module2;
/*Сформировать квадратную матрицу порядка n по правилу. A[i,j]=sin((i^2-j^2)/n) 
и подсчитать количество положительных элементов в ней.*/

public class Task17 {
	
	public static void printMatrix(double[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static void createMatrix(int n) {
		int counter = 0;
		double[][] nums = new double[n][n];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				nums[i][j] = Math.sin((i*i-j*j)/n);
				if (nums[i][j]>0) counter++;
			}
		}
		printMatrix(nums);
		System.out.print("Количество положительных элементов: "+ counter);
	}
	
	public static void main(String[] args) {
		int n = 2;
		createMatrix(n);
	}

}
