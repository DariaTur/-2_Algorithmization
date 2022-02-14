package by.epam.training.module2;
//Даны действительные числа a1,a2,...an. Найти max(a1+a2n,a2+a2n-1,...,an+an+1)

public class Task7 {
	
	public static double findMaxSum(double[] nums) {
		int n = nums.length -1;
		double sum = 0;
		for(int i = 0; i<(int)(nums.length)/2; i++) {
			if(nums[i]+nums[n-i] > sum) {
				sum = nums[i]+nums[n-i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		double[] a = {1,2,4,2,1,6};
		System.out.print(findMaxSum(a));
	}

}
