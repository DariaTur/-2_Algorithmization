package by.epam.training.module2;
/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3];D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
 расположенных элементов массива с номерами от k до m.*/

public class Task42 {
	
	public static int sumOfThree(int[] nums, int i) {
		return nums[i]+nums[i+1]+nums[i+2];
	}
	
	public static void main(String[] args) {
		int[] d = {1,2,3,4,5,6};
		for(int i = 0; i<d.length-2;i++) {
			System.out.println("Сумма с "+i+" по "+(i+2)+" элемент: "+sumOfThree(d,i));
		}

	}

}
