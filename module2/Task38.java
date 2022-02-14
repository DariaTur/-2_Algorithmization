package by.epam.training.module2;
/*На плоскости заданы своими координатами n точек. Написать метод(методы) , определяющие ,
между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив*/

import java.util.Scanner;

public class Task38 {
	
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
	
	public static double calcDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	}
	
	public static int[] maxDistance(int[][] nums) {
		double maxDist = 0;
		int[] indMax = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				 if (i==j) {
					 continue;
				 }
				 System.out.println(calcDistance(nums[i][0],nums[i][1], nums[j][0], nums[j][1]));
				 if(calcDistance(nums[i][0],nums[i][1], nums[j][0], nums[j][1])>maxDist) {
					 maxDist = calcDistance(nums[i][0],nums[i][1], nums[j][0], nums[j][1]);
					 indMax[0] = i;
					 indMax[1] = j;     
				 }
			}
		}
		return indMax;
	}
	
	public static void main(String[] args) {
		int n = readFromConsole();
		int[][] points ;
		
		if(n>2) {
			points = new int[n][2];
			for(int i=0; i<points.length; i++) {
				for(int j=0; j<points[i].length; j++) {
					points[i][j] = readFromConsole();
				}
			}
			printMatrix(points);
			int[] coords = maxDistance(points);
			System.out.print("Максимальное расстояние между точками ("+points[coords[0]][0]+", "+points[coords[0]][1]+
															") и ("+points[coords[1]][0]+", "+points[coords[1]][1]+")");
		} else {
			System.out.print("Неверное n!");
		}
		
	}

}
