package by.epam.training.module2;
import java.util.Arrays;
/*Дана последовательность действительных чисел a1,a2,...,an. Заменить все её члены, 
большие данного Z, этим числом. Подсчитать количество замен*/

public class Task2 {

	public static void main(String[] args) {
		double[] a = {3.5, 4.6, 2.3, 4.8, 3.6, 7.3, 9.6};
		double z = 4.0;
		int counter = 0;
		
		for(int i = 0; i<a.length; ++i) {
			if(a[i]>z) {
				a[i] = z;
				counter++;
			}
				
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Количество замен: " +counter);

	}

}
