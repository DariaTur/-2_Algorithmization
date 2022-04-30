package by.epam.training.module2;

import java.util.Arrays;

/*
 * 6.Сортировка Шелла. Дан  массив n действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
 *   Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai<=a(i+1), 
 *   то продвигаются на один элемент вперед. Если ai > a(i+1), то производится перестановка
 *   и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Task32 {
	
	public static int[] sort(int[] mas) {
		int tmp;
		int i = 1;
		
		while(i<mas.length) {
			if(mas[i-1]<=mas[i]) {
				i++;
			} else {
				tmp = mas[i];
				mas[i]=mas[i-1];
				mas[i-1]=tmp;
				if(i-1>0) {
					i--;
				}
			}
		}	
		return mas;
	}

	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("Массив до сортировки: "+Arrays.toString(a));
		System.out.print("Массив после сортировки: "+Arrays.toString(sort(a)));

	}

}
