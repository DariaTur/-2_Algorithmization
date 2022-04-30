package by.epam.training.module2;
//Написать метод(методы) для нахождения наибольшего общего делителя четырёх натуральных чисел.

import java.util.Scanner;

public class Task36 {
	
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
	
	public static int nod(int a, int b, int c, int d){
        return nod(nod(a,b),nod(c,d));
    } 
	
	public static void main(String[] args) {
		int a = readFromConsole();
		int b = readFromConsole();
		int c = readFromConsole();
		int d = readFromConsole();
		
		if(a<0 || b<0 || c<0 || d<0) {
			System.out.println("Числа должны быть натуральными!");
		} else {
			System.out.println("НОД: "+nod(a,b,c,d));
		}
		
	}

}
