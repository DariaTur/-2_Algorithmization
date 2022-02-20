package by.epam.training.module2;
/*Даны натуральные числа K и N. Написать метод(методы) формирования массива А, элементами
 которого являются числа, сумма цифр которых равна K и которые не больше N.*/

import java.util.Arrays;

public class Task46 {
	
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
	
	public static int sum(int[] nums) {
		int sum = 0;
		 
		for(int i: nums) {
			sum+= i;
		}
		
		return sum;
	}
	
	public static boolean check(int num, int[] nums) {
		boolean check = true;
		for(int i : nums) {
			if(num==i) {
				check = false;
			}
		}
		return check;
	}
	
	public static int[] createMas(int k, int n) {
		int[] mas = new int[k];
		int[] a = new int[k];
		int count = 0;
		int num = 1;
		
		for(int i = 0; i<k; i++) {
			while(true) {
				num = (int) (Math.random()*k*1000);
				if(sum(numbers(num))== k && num<n) {
					mas[i] = num;
					break;
				} 
			}
		}	
		for(int i=0;i<a.length; i++) {
			for(int j : mas) {
				if(check(j,a)) {
					a[i] = j;
					count++;
					break;
				}
			}
		}
		a = Arrays.copyOf(a, count);
		return a;
	}
	
	
	public static void main(String[] args) {
		int k = 13;
		int n = 12;
		
		if(k<n) {
			System.out.print(Arrays.toString(createMas(k, n)));
		} else {
			System.out.print("k должно быть меньше n");
		}
		
	}
}
