package listaMatriz;
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a [][] = new int [3][4];
		Random x = new Random();
		int i, b, c=0;
		
		for(c=0, i=0; i<3;i++) {
			for(c=0, b=0; b<3; b++) {
				a[i][b] = x.nextInt()%10;
				System.out.println(a[i][b]);
				c=c+a[i][b];
				
				if(b==2) {
					a[i][b] = c;
					System.out.println("Resultado: "+a[i][b]);
					
				}
				
				
			}
		}
		
		
		
		
		
	}

}
