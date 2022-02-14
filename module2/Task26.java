package by.epam.training.module2;
/*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
 1,2,3,...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
 равны между собой. Построить, такой квадрат. Пример магического квадрата порядка 3: {{6,1,8},{7,5,3},{2,9,4}}*/
//не сделала
public class Task26 {
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static int[][] createMagicSquare(int n) {
		int[][] square1 = new int[n][n];
		int[][] square2 = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square1[i][j] = 0;
				if(j+1+i == n) {
					square1[i][j] = (int)Math.ceil((double)n/2);
				}else if(i==j) {
					square1[i][j] = i+1;
				}
		
			}
		}
		return square1;
	}
	
	public static void main(String[] args) {
		printMatrix(createMagicSquare(5));

	}

}
