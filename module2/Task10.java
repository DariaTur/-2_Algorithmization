package by.epam.training.module2;
/*Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него
каждый второй элемент (освободившиеся элементы заполнить нулями).*/

public class Task10 {
	
	public static int[] delete(int[] nums) {
		for(int i = 0; i<nums.length; i++) {
			if (i%2!=0) {
				nums[i] = 0;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] a = {3,4,5,1,2,4,45};
		a = delete(a);
		for(int i : a) {
			System.out.print(i+" ");
		}

	}

}
