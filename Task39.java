package by.epam.training.module2;
/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Task39 {
	
	public static int secondMax(int[] a){
        int max = a[0];
        int secondMax = a[0];
        
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        for(int i = 1; i < a.length; i++){
            if(a[i]>secondMax && a[i]<max){
               secondMax = a[i];
            }
        }
        return secondMax;
    }

	public static void main(String[] args) {
		 int[] a = {1,3,4,5,2,6,0,7,9};
	     System.out.println(secondMax(a));
	}

}
