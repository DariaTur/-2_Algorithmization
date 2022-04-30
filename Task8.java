package by.epam.training.module2;
/*Дана последовательность целыъ чисел a1,a2,...,an. Образовать новую последовательность,
 * выбросив из исходной те члены, которые равны min(a1,a2,...,an)*/


public class Task8 {
	public static int findMinElem(int[] nums) {
		int min = nums[0];
		for(int i = 1; i<nums.length; i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
		}
		return min;
	}
	public static void delete(int[] nums) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]!=findMinElem(nums)) {
				System.out.print(nums[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,4,1,5,2,1,1,6,6};
		delete(a);
	}
}
