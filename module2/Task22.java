package by.epam.training.module2;
//Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

public class Task22 {
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static int[][] sortFromMin(int[][] nums) {
		int elem;
		boolean check = true;
		
		while (check){
			check = false;
			for(int i = 0; i<nums.length-1; i++) {
				for(int j = 0; j<nums[i].length; j++){
					if(nums[i][j]>nums[i+1][j]) {
						elem = nums[i][j];
						nums[i][j] = nums[i+1][j];
						nums[i+1][j] = elem;
						check = true;
					}
				}
			}
		}
		return nums;
	}
	
	public static int[][] sortFromMax(int[][] nums) {
		int elem;
		boolean check = true;
		
		while (check){
			check = false;
			for(int i = 0; i<nums.length-1; i++) {
				for(int j = 0; j<nums[i].length; j++){
					if(nums[i][j]<nums[i+1][j]) {
						elem = nums[i][j];
						nums[i][j] = nums[i+1][j];
						nums[i+1][j] = elem;
						check = true;
					}
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,0},{12,22,3},{4,1,6}};
		System.out.println("Исходная матрица:");
		printMatrix(a);
		a = sortFromMin(a);
		System.out.println("Матрица с отсортированными столбцами по возрастанию:");
		printMatrix(a);
		a = sortFromMax(a);
		System.out.println("Матрица с отсортированными столбцами по убыванию:");
		printMatrix(a);
	}
}
