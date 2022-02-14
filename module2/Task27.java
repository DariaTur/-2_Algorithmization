package by.epam.training.module2;
/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого, при
 этом не используя дополнительный массив.*/

public class Task27 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {0,0,0,0};
		int k = 98;
		
		if(k>a.length || k<0) {
			System.out.println("Неправильно введённое k");
		} else {
			for(int i = 0; i<a.length; i++) {
				System.out.print(a[i]+" "); 
				if(i == k ) {
					for(int j = 0; j<b.length; j++) {
						System.out.print(b[j]+" "); 
					}
				}
			}
		}
	}	
}
