package by.epam.training.module2;
/*Два простых числа называются «близнецами», если они отличаются друг от друга
    на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
    n,2n], где n - заданное натуральное число больше 2. Для решения задачи
    использовать декомпозицию.*/

import java.util.Scanner;

public class Task47 {

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
	
	public static boolean check(int num) {
		boolean checker = true; 
		for(double i = 2; i<=Math.ceil(Math.sqrt(num));i++) {
			if(num%i==0) {
				checker = false;
				break;
			}
		}
		return checker;
	}
	
	public static void twinsNumbers(int n) {
		int elem = n;
		
		System.out.println("Простые числа-близнецы между "+n+" и "+2*n+":");
		for(int i = n+1  ; i<2*n+1; i++) {
			if (check(i)) {
				if (i == elem+2) {
					System.out.println(elem+" "+i);
				}
				elem = i;
			}
		}
	}

	public static void main(String[] args) {
		int n = readFromConsole();
		
		if (n<=2) {
			System.out.println("Некорректные данные!");
		} else {
			twinsNumbers(n);
		}
	}

}
