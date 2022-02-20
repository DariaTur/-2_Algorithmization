package by.epam.training.module2;

import java.util.Arrays;

/*Даны две последовательности a 1 <= a 2 <= ... <= a n и b 1 <= b 2 <= ... <= b m . 
Образовать из них новую последовательность чисел так, чтобы она тоже была 
неубывающей. Примечание. Дополнительный массив не использовать. */


public class Task28 {

	public static void main(String[] args) {
		int[] a = {1,1,2,4,5,6};
		int[] b = {3,4,7,8,9,10,11};
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(k<a.length+b.length) {
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				if(i<a.length-1) {
					i++;
				} else {
					a[i] = Integer.MAX_VALUE;
				}
				
			} else {
				System.out.print(b[j]+" ");
				if(j<b.length-1) {
					j++;
				} else {
					b[j] = Integer.MAX_VALUE;
				}
			}
			k++;
		}
	}
}
