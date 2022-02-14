package by.epam.training.module2;
/*Даны натуральные числа K и N. Написать метод(методы) формирования массива А, элементами
 которого являются числа, сумма цифр которых равна K и которые не больше N.*/

public class Task46 {
	
	public static void createMas(int k, int n) {
		int[] a = new int[k];
		int i = 0;
		
		while(k!=0) {
			a[i] = (int)Math.random()*n;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
