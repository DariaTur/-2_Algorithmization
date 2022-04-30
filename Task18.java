package by.epam.training.module2;
import java.util.Scanner;
/*В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить на \
 соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 пользователь с клавиатуры. */

public class Task18 {
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static int readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		int num = sc.nextInt();
		return num;
	}
	
	public static int[][] swap(int[][] nums, int k, int p) {
		int[] a = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			a[i] = nums[i][k];
			nums[i][k] = nums[i][p];
			nums[i][p] = a[i];
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[][] a =  {{1,2,3},{12,23,45},{34,1,2}};
		int k = readFromConsole();
		int p = readFromConsole();
		if(k<a.length && p<a.length) {
			System.out.println("Матрица до изменения:");
			printMatrix(a);
			a = swap(a,k,p);
			System.out.println("Матрица после того, как поменяли местами "+k+"-й и "+p+"-й столбец:");
			printMatrix(a);
		}else System.out.println("Неправильные k или p");
	}
}
