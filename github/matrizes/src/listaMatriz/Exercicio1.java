package listaMatriz;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][] = new int[4][4];
		int i, b, c=0, d=1;
		
		a[0][0] = 2;
		
		for(i=0; i<4; i++) {
			for(b=0; b<4; b++) {
				d *=a[0][0];
				a[i][b] = d;
				
				
					
				
				System.out.printf(a[i][b]+" ");
			}
			
			
			if(b==4) {
				System.out.printf("\c");
				
			}
			
			
			
			
		}
		
		
		
		
		
	}
}

