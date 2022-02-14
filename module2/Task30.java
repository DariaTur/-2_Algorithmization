package by.epam.training.module2;
/*Сортировка обменами. Дана последовательность чисел 1 <= a 2 <= ... <= a n .(Некорректно, сделала для рандомной)
Требуется переставить числа в порядке возрастания. Для этого сравниваются два
соседних числа a i и a i + 1 .Если a i > a i + 1 , то делается перестановка.
Так продолжается до тех пор,пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/      

public class Task30 {
	
	public static int[] createMas(int n) {
		int[] nums = new int[n]; 

		for(int i = 0; i<n;i++) {
			nums[i] = (int)(Math.random()*100);
		}
		return nums;
	}
	
	public static int[] sort(int[] nums) {
		int min;
		boolean check = true;
		int counter = 0;
		
		while (check) {
			check = false;
			for(int i = 0; i<nums.length-1;i++) {
				if(nums[i]>nums[i+1]) {
					min = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = min;
					check = true;
					counter++;
				}
			}
		}
		System.out.println("Количество перестановок: "+counter);
		return nums;
	}
	
	
	public static void main(String[] args) {
		int n = 8;
		if (n<0) {
			System.out.println("Неправильно введённое n");
		} else {
			int[] nums = createMas(6);
			System.out.println("Исходный массив: ");
			for(int i : nums) {
				System.out.print(i+" ");
			}
			System.out.println();
			nums =  sort(nums);
			System.out.println("Исходный массив после сортировки: ");
			for(int i :  nums) {
				System.out.print(i+" ");
			}
		}
	}
}
