package by.epam.training.module2;
/*Найти все натуральные n-значные числа, цифры в которых образуют строго
  возрастающую последовательность (например, 1234, 5789). Для решения задачи
 использовать декомпозицию.*/

import java.util.Scanner;

public class Task49 {
	
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
	
	public static boolean checkSeq(int num) {
		boolean check = true;
		int[] nums = numbers(num);
		
		for(int i = 0; i<nums.length-1; i++) {
			if(nums[i]>=nums[i+1]) {
				check = false;
			}
		}
		return check;
	}
	
	public static void findNumbers(int n) {
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
		System.out.println("Числа, цифры в которых образуют строго возрастающую последовательность:");
		for(;k<Integer.parseInt(String.join("", nums2))+1;k++) {
			if (checkSeq(k)) {
				System.out.print(k+" ");
			}
		}
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
		
		if(n>1) {
			findNumbers(n);
		} else {
			System.out.println("Неверные данные!");
		}
		

	}

}
