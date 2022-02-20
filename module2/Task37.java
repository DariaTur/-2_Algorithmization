package by.epam.training.module2;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. 

import java.util.Scanner;

public class Task37 {
	
	public static int readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		int num = sc.nextInt();
		return num;
	}
	
	public static double square(int a){
        return Math.sqrt(3)*a*a/4;
    }
    
	public static void main(String[] args) {
		int a = readFromConsole();
		
		if(a>0) {
			System.out.println("Площадь правильного шестиугольника со стороной "+a+": "+6*square(3));
		} else {
			System.out.println("Треугольника с такой стороной быть не может!");
		}
	}

}
