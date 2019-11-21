package listaMatriz;
import java.util.Random;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a[][] = new int[4][4];
        int i=0, b=0, c=0, d=0, e, f=0, g=0;
        Random x = new Random();

        for(i=0; i<3; i++){
            for(b=0; b<3; b++){
                a[i][b] = x.nextInt(75);
                System.out.print(a[i][b]+" ");
                if(b==2){
                    System.out.println("\e");
                }

            }
        }

        for(g=1; g<=50; g++){
                e = ler.nextInt();
                System.out.println(n);

            for(f=0, i=0; i<3; i++){
                for(b=0; b<3; b++){
        
                    
                    if(e==a[i][b]){
                        f++;
                        c=c+f;
                        
                        System.out.println("O número tem na cartela");

                    }
                
                }

            }
                if(f==0){
                    System.out.println("O número não tem na cartela");

                }

                if(c==9){
                    System.out.println("BINGO!");
                    System.out.println("Demorou "+g+" rodadas para você ganhar!");
                    break;
                }
        }


        

        
    }
}