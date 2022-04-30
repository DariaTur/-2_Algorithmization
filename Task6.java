package by.epam.training.module2;
/*Задана последовательность вещественных чисел. Вычислить сумму чисел, 
порядковые номера которых являются простыми числами.*/

public class Task6 {
	
	public static boolean check(int num) {
		boolean checker = true; 
		for(double i = 2; i<=Math.ceil(Math.sqrt(num));i++) {
			if(num%i==0) {
				checker = false;
				break;
			}
		}
		return checker;
	}
	
	public static double sum(double[] nums) {
		double sum = nums[2];
		for(int i = 3;i<nums.length;i++) {
			if (check(i)) {
				sum += nums[i];	
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		double[] N = {1.0,6.7,5.4,0.8,8.3,6.0};
//		double[] N = {1,1,1,1,1,1,1,1};

		System.out.print("Сумма равна: "+sum(N));

	}

}
