package by.epam.training.module2;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел.

import java.util.Scanner;

public class Task35 {

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
	
	public static int nod(int a, int b){
        while(a!=b){
            if(a<b){
                b = b-a;
            } else{
                a = a-b;
            }
        }
        return b;
    } 

	public static int nok(int a, int b){
        int nok = a*b/nod(a,b); 
        return nok;
    }

	public static void main(String[] args) {
		int a = readFromConsole();
		int b = readFromConsole();
		
		if(a<0 || b<0) {
			System.out.println("Числа должны быть натуральными!");
		} else {
			System.out.println("НОД: "+nod(a,b));
			System.out.println("НОК: "+nok(a,b));
		}
		
		
	}

}
