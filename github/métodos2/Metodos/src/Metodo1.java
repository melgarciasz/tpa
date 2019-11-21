import java.util.Scanner;
public class Metodo1 {

	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		double dinheiro;
		int meses;
		
		System.out.println("Digite o valor");
		dinheiro = ler.nextDouble();
		System.out.println("Digite o número de meses");
		meses = ler.nextInt();
		System.out.println(investir (dinheiro,meses));
	}
	public static double dinheiro (double dinheiro, int meses) { 	
			 
			double e = dinheiro;
			for (int i=1;i<=meses;i++) {
				
			
			e += e*1/100; 
			
			
}	
		return r;
	}		
			
}  

		
		
		
		
		
		
		

		
		

	
