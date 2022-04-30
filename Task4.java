package by.epam.training.module2;
//Даны действительные числа a1,a2,..,an. Поменять местами наибольший и наименьший элементы.

public class Task4 {
	
	public static int findMinInd(double[] nums) {
		int minInd = 0;
		double minElem = nums[minInd];
		
		for(int i = 1; i < nums.length; i++) {
			if (nums[i]<minElem){
				minInd = i;
			}
		}
		return minInd;
	}
	
	public static int findMaxInd(double[] nums) {
		int maxInd = 0;
		double maxElem = nums[maxInd];
		
		for(int i = 1; i < nums.length; i++) {
			if (nums[i]>maxElem){
				maxInd = i;
			}
		}
		return maxInd;
	}
	
	public static double[] swap(double[] nums) {
		int minInd = findMinInd(nums);
		int maxInd = findMaxInd(nums);
		double min = nums[minInd]; 
		nums[minInd] = nums[maxInd];
		nums[maxInd] = min;
		
		return nums;
	}
	public static void main(String[] args) {
		double[] a = {-1.0,2.0,6.0,50.0,7.0,10.0};
		
		a = swap(a);
		for(double i : a) {
			System.out.print(i+" ");
		}

	}

}
