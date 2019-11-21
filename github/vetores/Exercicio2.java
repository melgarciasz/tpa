import java.util.*;
public class Exercicio2{
    public static void main(String[] args){
        Scanner ler = new Scanner(SYstem.in);
        int a[],i,a1,b1,c1,d1,e1;
        a = new int [6];
        
		for (i = 1;i<=5;i++) {
			System.out.println("Digite os valores");
			a[i] = in.nextInt();
		}
		
		
		for (i = 1;i<=10;i++) {
			a1 = a[1] * i;
			System.out.println("A Tabuado do 1º indice é:" +a1);
		}
		for (i = 1;i<=10;i++) {
			b1 = a[2] * i;
			System.out.println("A Tabuado do 2º indice é:" +b1);
		}
		for (i = 1;i<=10;i++) {
			c1 = a[3] * i;
			System.out.println("A Tabuado do 3º indice é:" +c1);
		}
		for (i = 1;i<=10;i++) {
			d1 = a[4] * i;
			System.out.println("A Tabuado do 4º indice é:" +d1);
		}
		for (i = 1;i<=10;i++) {
			e1 = a[5] * i;
			System.out.println("A Tabuado do 5º indice é:" +e1);
		}
    }
}