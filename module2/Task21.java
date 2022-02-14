package by.epam.training.module2;
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task21 {
	
	public static int[] sortFromMax(int[] nums) {
		int elem ;
		boolean check = true;
		
		while (check){
			check = false;
			for(int i = 0; i<nums.length-1;i++) {
				if(nums[i]<nums[i+1]) {
					elem = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = elem;
					check = true;
				}
			}
		}
		return nums;
	}
	
	public static int[] sortFromMin(int[] nums) {
		int elem ;
		boolean check = true;
		
		while (check){
			check = false;
			for(int i = 0; i<nums.length-1;i++) {
				if(nums[i]>nums[i+1]) {
					elem = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = elem;
					check = true;
				}
			}
		}
		return nums;
	}
	
	public static int[][] sortRows(int[][] nums, String cond){
		for(int i = 0; i<nums.length; i++) {
			if (cond == "fromMin") {
				nums[i] = sortFromMin(nums[i]);
			} else if(cond == "fromMax") {
				nums[i] = sortFromMax(nums[i]);
			}
			
		}
		return nums;
	}
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,0,-1},{12,22,3,1},{4,1,6,0}};
		System.out.println("Исходная матрица:");
		printMatrix(a);
		a = sortRows(a,"fromMin");
		System.out.println("Матрица с отсортированными строками по возрастанию:");
		printMatrix(a);
		System.out.println("Матрица с отсортированными строками по убыванию:");
		a = sortRows(a,"fromMax");
		printMatrix(a);
	}
}
