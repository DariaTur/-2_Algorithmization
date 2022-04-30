package by.epam.training.module2;
/*Сортировка выбором. Дана последовательность чисел a 1 <= a 2 <= ... <= a n.
Требуется переставить элементы так, чтобы они  были расположены по убыванию.
Для этого в массиве, начиная с первого,выбирается наибольший элемент и ставится на первое место, 
а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором. */                  
public class Task29 {
	
	public static int[] sort(int[] nums) {
		for(int i = 0; i< nums.length; i++) {
			int max = nums[i];
			int pos = i;
			
			for(int j = i+1; j<nums.length; j++) {
				if (nums[j]>max) {
					max = nums[j];
					pos = j;
				}
			}
			nums[pos] = nums[i];
			nums[i] = max;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {1,1,2,2,4,5,6};
		a = sort(a);
		for(int i : a) {
			System.out.print(i+" ");
		}

	}

}
