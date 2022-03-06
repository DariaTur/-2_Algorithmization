package by.epam.training.module2;

/*
 * 8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
 *   которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task34 {
	
	public static Fraction[] sort(Fraction[] mas) {
		Fraction tmp;
		int i = 1;
		
		while(i<mas.length) {
			if(mas[i-1].getNumerator()<=mas[i].getNumerator()) {
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
		int n = 6;
		Fraction[] f = new Fraction[n];
		int proizv = 1;
		
		System.out.println("Old array");
		for(int i = 0; i<n; i++) {
			f[i] = new Fraction((int)(Math.random()*100),(int)(Math.random()*100));
			f[i].reduceFrac();
			proizv*=f[i].getDenomenator();
			System.out.print(f[i].getNumerator()+"/"+f[i].getDenomenator()+" ");

		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			f[i].setNumerator(proizv/f[i].getDenomenator());
			f[i].setDenomenator(proizv);
		}
		f = sort(f);
		System.out.println("New array");
		for(int i = 0; i<n; i++) {
			System.out.print(f[i].getNumerator()+"/"+f[i].getDenomenator()+" ");

		}
		
	}

}

class Fraction{
	private int p;
	private int q;
	
	public Fraction(int p, int q){
		this.p = p;
		this.q = q;
	}
	
	public void setDenomenator(int q) {
		if(q!=0) {
			this.q=q;
		} else {
			System.out.println("Знаменатель не может быть равен 0!");
		}
	}
	
	public int getDenomenator() {
		return q;
	}
	
	public void setNumerator(int p) {
		this.p = p;
	}
	
	public int getNumerator() {
		return p;
	}
	
	public int nod(int p, int q) {
		while(p!=q){
            if(p<q){
                q = q-p;
            } else{
                p = p-q;
            }
        }
		return p;
	}
	
	
	public void reduceFrac() {
		int b = nod(this.p,this.q);
		if(b!=0) {
			this.p = this.p/b;
			this.q = this.q/b;
		}
	}
	
}