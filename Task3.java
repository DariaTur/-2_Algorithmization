package by.epam.training.module2;
import java.util.Scanner;
/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нём отрицательных,
 положительных и нулевых элементов.*/

public class Task3 {

	public static void main(String[] args) {
		int n;
		double[] nums;
		int counterNull = 0;
		int counterPosit = 0;
		int counterNegat = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		n = sc.nextInt();
		nums = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print(">>");
			nums[i] = sc.nextInt();
			if (nums[i] == 0){
				counterNull++;
			}
			else if(nums[i]>0) {
				counterPosit++;
			}
			else {
				counterNegat++;
			}
		}
		System.out.println("Количество нулевых элементов: "+counterNull);
		System.out.println("Количеством положительных элементов: "+counterPosit);
		System.out.println("Количество отрицательных элементов: "+counterNegat);
	
	}

}
