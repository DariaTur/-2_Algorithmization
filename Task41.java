package by.epam.training.module2;
//Написать метод(методы) для вычисления суммы факториалов всех нечётных чисел от 1 до 9

public class Task41 {
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact *=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=9; i+=2) {
			sum += factorial(i);
		}
		System.out.println(sum);
	}
}
