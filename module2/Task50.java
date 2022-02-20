package by.epam.training.module2;
/*Написать программу, определяющую сумму n - значных чисел, содержащих только
    нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
    решения задачи использовать декомпозицию.*/

import java.util.Scanner;

public class Task50 {
	
	public static int[] numbers(long num){
        int n = 0;
        long num2 = num;
        int[] mas ;
        
        while(num2!=0){
            num2 /=10;
            n++;
        }
        mas = new int[n];
        for(int i = n-1; i>=0;i--){
            mas[i] = (int)num%10;
            num /= 10;
        }
        return mas;
    }
	
	public static boolean checkOdd(int num) {
		boolean check = true;
		int[] nums = numbers(num);
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				check = false;
			}
		}
		return check;
	}
	
	public static long sum(int n) {
		long sum = 0;
		String[] nums1 = new String[n];
		String[] nums2 = new String[n];
		nums1[0] = "1";
		
		for(int i = 1; i<n; i++) {
			nums1[i] = "0";
		}
		
		for(int i = 0; i<n; i++) {
			nums2[i] = "9";
		}
		int k = Integer.parseInt(String.join("", nums1));
		for(;k<Integer.parseInt(String.join("", nums2))+1;k++) {
			if(checkOdd(k)) {
				if(sum<=Long.MAX_VALUE) {
					sum+=k;
				} else {
					System.out.println("Слишком большое значение для long");
				}
			}
		}

		return sum;
	}
	
	public static int countEven(long sum) {
		int counter = 0;
		int[] nums = numbers(sum);
		for(int i: nums) {
			if(i%2==0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		int num = sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		int n = readFromConsole();
		
		if(n>0) {
			long res = sum(n);
			System.out.print("Сумма: ");
			System.out.println(res);
			System.out.println("Количество четных элементов в сумме: "+countEven(res));

		} else {
			System.out.println("Неверные данные!");
		}
		
	}

}
