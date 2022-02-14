package by.epam.training.module2;
/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма
 его цифр, возведённая в степень n, равна самому числу. Найти все такие числа от 1 до k. Для
 решения этой задачи использовать декомпозицию */

import java.util.Scanner;

public class Task48 {
	
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
	
	public static int[] numbers(int num){
        int n = 0;
        int num2 = num;
        int[] mas ;
        
        while(num2!=0){
            num2 /=10;
            n++;
        }
        mas = new int[n];
        for(int i = n-1; i>=0;i--){
            mas[i] = num%10;
            num /= 10;
        }
        return mas;
    }
    
    public static boolean armstrongNumbers(int num){
        int[] nums = numbers(num);
        int sum = 0;
        
        for(int i:nums){
            sum+=Math.pow(i,nums.length);
        }
        
        if (sum==num){
            return true;
        } else{
            return false;
        }
    }

	public static void main(String[] args) {
		int k = readFromConsole();
		
		if(k<=1) {
			System.out.println("Некорректные данные.");
		}else {
			System.out.println("Числа Армстронга в промежутке от 1 до "+k);
			for(int i = 1; i<k; i++){
				if (armstrongNumbers(i)){
					System.out.println(i);
					}
			}
		}
	}

}
