package by.epam.training.module2;
/*Дано натуральное число N. Написать метод(методы)  
для формирования массива, элементами которого являются цифры числа N.*/

import java.util.Scanner;

public class Task44 {
	
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

	public static void main(String[] args) {
		int num = readFromConsole();
		
		 for(int i: numbers(num)){
	          System.out.println(i);
		 }

	}

}
