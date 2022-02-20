package by.epam.training.module2;

import java.util.Arrays;

/*Сортировка вставками. Дана последовательность чисел a 1 , a 2 , ... , a n . 
Требуется переставить числа в порядке возрастания.Делается это следующим образом. 
Пусть a 1 , a 2 , ... , a i - упорядоченная последовательность, т. е. a 1 <= a 2 <= ... <= a n . 
Берется следующее число a i + 1 и вставляется в последовательность так, чтобы новая           *
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все 
элементы от i +1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью *
 двоичного поиска. Двоичный поиск оформить в виде отдельной функции. */

public class Task31 {
	
	public static int binarySearch(int[] mas, int ind) {
		int low = 0;
		int high = ind;
		int mid = 0;
		
		while (low<=high) {
			mid = (int)((low+high)/2);
			if (mas[mid]<=mas[ind] && mas[mid+1]>=mas[ind]) {
				return mid+1;
			} else if(mas[mid]>mas[ind]) {
				high = mid - 1;
			} else if (mas[mid]<mas[ind]) {
				low = mid + 1;
			}
		}
		return 0;
	}
	
	public static int[] cycleSwap(int[] array, int ind1, int ind2) {
	    	if(array.length!=0) {
	    		int tmp1 = array[ind1];
	    		int tmp2 ;
	    
	    		array[ind1] = array[ind2];
	    		for(int i = ind1+1; i<ind2+1;i++) {
	    			tmp2 = array[i];
	    			array[i] = tmp1;
	    			tmp1 = tmp2;
	    		}
	    	}
	    	return array;
	    }
	
	public static int[] sort(int[] mas) {
		for(int i = 0; i<mas.length; i++) {
			for(int j = 0; j<i; j++ ) {
				mas = cycleSwap(mas, binarySearch(mas,i),i);
			}
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] a = {3,2,1,6,7,8,3,2,4};
		System.out.println("Массив до сортировки: "+Arrays.toString(a));
		System.out.print("Массив после сортировки: "+Arrays.toString(sort(a)));
	}
}
