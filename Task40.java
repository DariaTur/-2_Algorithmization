package by.epam.training.module2;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task40 {
	
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
 
    public static boolean isRelativePrime(int a, int b, int c){
        if(nod(nod(a,b),c)==1){
            return true;
        } else{
            return false;
        }
     }

	public static void main(String[] args) {
		int a = readFromConsole();
		int b = readFromConsole();
		int c = readFromConsole();
		
		if(a<0 || b<0 || c<0 ) {
			System.out.println("Числа должны быть натуральными!");
		} else {
			if (isRelativePrime (a, b, c)) {
				System.out.println("Числа взаимно простые");
			}else {
			System.out.println("Числа не взаимно простые");
			}
		}

	}

}
