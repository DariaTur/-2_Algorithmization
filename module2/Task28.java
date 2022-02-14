package by.epam.training.module2;
/*Даны две последовательности a 1 <= a 2 <= ... <= a n и b 1 <= b 2 <= ... <= b m . 
Образовать из них новую последовательность чисел так, чтобы она тоже была 
неубывающей. Примечание. Дополнительный массив не использовать. */
//не сделала

public class Task28 {

	public static void main(String[] args) {
		int[] a = {1,1,2,2,4,5,6};
		int[] b = {3,3,4,7};
		for(int i : a) {
			for(int j : b) {
				if(i<j) {
					System.out.print(i+" ");
				} else {
					System.out.print(j+" ");
				}
			}
		}
	}
}
