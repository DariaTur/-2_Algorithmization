package by.epam.training.module2;

import java.util.Arrays;

/*
 * 7.Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
 *   Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в
 *   первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task33 {
	
	public static int binarySearch(double[] a, double b, int l) {
		int low = 0;
		int high = l;
		int mid = 0;
		
		while (low<=high) {
			mid = (int)((low+high)/2);
			if (a[mid]<=b && a[mid+1]>=b) {
				return mid+1;
			} else if(a[mid]>b) {
				high = mid - 1;
			} else if (a[mid]<b) {
				low = mid + 1;
			}
		}
		return 0;
	}
	
	public static double[] cycleSwap(double[] array, int ind1, int ind2) {
    	if(array.length!=0) {
    		double tmp1 = array[ind1];
    		double tmp2 ;
    
    		array[ind1] = array[ind2];
    		for(int i = ind1+1; i<ind2+1;i++) {
    			tmp2 = array[i];
    			array[i] = tmp1;
    			tmp1 = tmp2;
    		}
    	}
    	return array;
    }


	public static void main(String[] args) {
		int n = 5;
		int m = 4;		
		double[] a = new double[n];
		double[] b = new double[m];
		double[] c = new double[n+m];
		
		a[0] = Math.random()*100;
		for(int i = 1; i<n; i++) {
			while(a[i]<a[i-1]) {
				a[i] = Math.random()*100;
			}
		}
		
		b[0] = Math.random()*100;
		for(int i = 1; i<m; i++) {
			while(b[i]<b[i-1]) {
				b[i] = Math.random()*100;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i = 0; i<n+m; i++) {
			if(i<n) {
				c[i] = a[i];
			}else {
				c[i] = b[Math.abs(n-i)];
			}
		}

		for(int i = 0; i<m; i++) {
			System.out.println(binarySearch(c,c[n+i],n));
			if(binarySearch(c,c[n+i],n)!=0) {
				c = cycleSwap(c,binarySearch(c,c[n+i],n), n+i);
			}	
		}
		System.out.println(Arrays.toString(c));
	}

}
