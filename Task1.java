package by.epam.training.module2;
// В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
	public static int sum(int[] a, int k) {
		int sum = 0;
		for(int i = 0; i<a.length; ++i) {
			 if(a[i]%k==0) {
				 sum+=a[i];
			 }
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a = {2,5,6,78,7,57};
		int k = 5;
		
		System.out.println(sum(a,k));

	}

}
