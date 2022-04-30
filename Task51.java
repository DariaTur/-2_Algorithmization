package by.epam.training.module2;
/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию*/

import java.util.Scanner;

public class Task51 {
	
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
	        
	        if(num<0) {
	        	num *=-1;
	        }
	        
	        while(num2!=0){
	            num2 /=10;
	            n++;
	        }
	        mas = new int[n];
	        for(int i = n-1; i>=0;i --){
	            mas[i] = num%10;
	            num /= 10;
	        }
	        return mas;
	    }
	
	public static int sum(int[] nums) {
		int sum = 0;
		
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}
	
	public static void count(int num) {
		int counter = 0;
		
		while(num>0) {
			num -= sum(numbers(num));
			System.out.println(num);
			counter++;
		}
		
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		int n = readFromConsole();
		
		if (n<0) {
			System.out.println("Некорректные данные");
		}else {
			count(n);
		}
		
	}

}
