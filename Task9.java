package by.epam.training.module2;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 Если такиx чисел несколько, то определить наименьшее из них*/

public class Task9 {
	
	public static int[] sort(int[] nums) {
		int min;
		boolean check = true;
		
		while (check) {
			check = false;
			for(int i = 0; i<nums.length-1;i++) {
				if(nums[i]>nums[i+1]) {
					min = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = min;
					check = true;
				}
			}
		}
		return nums;
	}	
		
	public static int search(int[] nums) {
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		nums = sort(nums);
		
		int counter = 0;
		int counter2 = 0;
		int elem = nums[0];
		int elem2 = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==elem) {
				counter++;
			}else {
				elem = nums[i];
				if(counter>counter2) {
					counter2 = counter;
					elem2 = nums[i-1];
				}
				counter = 1;
			}
		}
		return elem2;
	}
	public static void main(String[] args) {
		int[] a = {4,4,4,2,2,2,2,6,5,1,1,1};
		System.out.print("Наиболее часто встречающееся число(наименьшее из них): "+search(a));
	}

}
