package by.epam.training.module2;
//Написать метод(методы), определяющий, в каком их данных двух чисел больше цифр.

import java.util.Scanner;

public class Task45 {
	
	public static long readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print(">>");
		}
		long num = sc.nextLong();
		return num;
	}
	
	
	public static long[] numbers(long num){
        int n = 0;
        long num2 = num;
        long[] mas ;
        
        if(num<0) {
        	num *=-1;
        }
        
        while(num2!=0){
            num2 /=10;
            n++;
        }
        mas = new long[n];
        for(int i = n-1; i>=0;i--){
            mas[i] = num%10;
            num /= 10;
        }
        return mas;
    }

	public static void findLonger(long n1, long n2) {
		if (numbers(n1).length <numbers(n2).length){
	         System.out.println("Во втором числе цифр больше");
	     } else{
	         System.out.println("В первом числе цифр больше");
	     }
	}
	
	public static void main(String[] args) {
		long num1 = readFromConsole();
		long num2 = readFromConsole();
		
		if(num1 > Long.MAX_VALUE || num2 > Long.MAX_VALUE || num1 < Long.MIN_VALUE || num2 < Long.MIN_VALUE){
			System.out.print("Некорректные данные");
		} else {
			findLonger(num1, num2) ;
		}
	}
}
