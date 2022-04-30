package by.epam.training.module2;
import java.util.Random;
import java.util.Scanner;

/*Сформировать случайную матрицу m x n, состоящую из нулей и 
единиц, причём в каждом столбце число единиц равно номеру столбца.*/

public class Task23 {
	
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
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static int[][] createMatrix(int m, int n) {
		int[][] nums = new int[m][n];
		int counter;
		int i;
		Random random = new Random();
		
		for(int j = 1; j<n; j++) {
			counter = 0;
			while(counter<j) {
				i = random.nextInt(m);
				if (nums[i][j]!=1) {
					nums[i][j]= 1;
					counter++;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int m = readFromConsole();
		int n = readFromConsole();
		while(m<n) {
			System.out.println("Введите m ещё раз!");
			m = readFromConsole();
		}
		printMatrix(createMatrix(m, n));
	}
}
