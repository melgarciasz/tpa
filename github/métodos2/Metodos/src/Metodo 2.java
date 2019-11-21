package metodos;

import java.util.Scanner;
public class ex1 {
	public static void main  (String [] args) {
		int menu;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 1 para Fatorial \nDigite 2 para Tabuada\nDigite 3 para Aposentadoria\nDigite 4 para Potencia\nDigite 5 para Sair");
		
		menu=ler.nextInt();
		
		if(menu == 1) {
		Fatorial ();
		}
		else if (menu == 2){
			Tabuada ();
		}
		else if (menu == 3){
			Aposentadoria ();
		}
		else if (menu == 4){
			int a, b;
			System.out.println("Digite a base");
			a=ler.nextInt();
			System.out.println("Digite o expoente");
			b=ler.nextInt();
			Potencia (a,b);
		}
		else if (menu == 5){
			Sair ();
		}
		
		}
	
	
	
	
public static void Fatorial () {
	
	 Scanner ler = new Scanner (System.in);

	int fat = 1;
	int valor; 

	System.out.println("Insira o número pro fatorial" );
	valor = ler.nextInt();
	
	for( int i = 2; i <= valor; i++ )
	{
	fat *= i;
	}

	System.out.println( "O fatorial de " + valor + " é igual a " + fat );
	}
	



public static void Tabuada () {
	 Scanner ler = new Scanner (System.in);
		
	 System.out.println("Digite um número da tabuada");
	 int n = ler.nextInt();

	 for(int y = 0; y <= 10; y++) {
		 System.out.println( +n+ " X " +y+ " = " +n*y );
	  }
}                        



public static void Aposentadoria () {
	 Scanner ler = new Scanner (System.in);
		int sex;
		int age;
		int apos;
	 
	 System.out.println("Digite 1 para Masculino\n2 para Feminino");
	 sex = ler.nextInt();
	 
	 System.out.println("Digite sua idade");
	 age = ler.nextInt();
	 
	 
	 
	 if(sex == 1 && sex > 0 & sex < 3){
		apos = 65 - age;
		 System.out.println("Você demorará " +apos+ " anos para se aposentar");
	 }
	 
	 else if(sex == 2 && sex > 0 && sex < 3){
		 apos = 60 - age;
		 System.out.println("Você demorará " +apos+ " anos para se aposentar");
	 }
	 
	 else {
		 
		 System.out.println("Seu acéfalo, escreva 1 ou 2!!!!!");
		 
	 }
}



public static void Potencia (int b, int e) {
	int i,b2 = 1;
	for (i = 0;i<e;i++) {
		b2 = b2 * b;
	}
	System.out.println("A potencia fica: " +b2);
}



public static void Sair () {
	System.exit(0);
}
}
