package by.epam.training.module2;
/*   Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод
* (методы) вычисления его площади, если угол между сторонами длиной X и Y —
* прямой.
*/

import java.util.Scanner;

public class Task43 {
	
	public static double readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print(">>");
		}
		double num = sc.nextDouble();
		return num;
	}
	 
	public static double square(double x, double y, double z, double t){
        double gipot = Math.sqrt(x*x+y*y);
        double halfPerim = (gipot+z+t)/2;
        double square1 = x*y/2;
        double square2 = Math.sqrt(halfPerim*(halfPerim-gipot)*(halfPerim-z)*(halfPerim-t));
        
        return square1+square2;
    }

	public static void main(String[] args) {
		double x = readFromConsole();
		double y = readFromConsole();
		double z = readFromConsole();
		double t = readFromConsole();
		
		if(x<=0||y<=0||z<=0||t<=0) {
			System.out.println("Некорректные данные.");
		}else {
			System.out.println("Площадь четырёхугольника со сторонами "+x+", "+y+", "+z+", "+t+": "+square(x,y,z,t));
		}

	}

}
