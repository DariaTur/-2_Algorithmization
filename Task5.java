package by.epam.training.module2;
//Даны целые числа a1,a2,...,an. Вывести на печать только те числа, для которых ai>i.

public class Task5 {
	public static void print(int[] nums) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>i) {
				System.out.print(nums[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {0,1,2,3,5,6,7,8};
		print(a);

	}

}
