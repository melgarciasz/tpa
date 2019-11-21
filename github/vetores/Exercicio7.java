import java.util.*;
public class Exercicio7{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int d = 1;
        int i = 0, e = 0;

        for(i = 0; i<5; i++){
        System.out.println("Digite o"+(i+1)+" Numero do Vetor");
        a[i] = ler.nextInt();
    
        }
        
        for(e = 0; e<5; e++){
            d = d*a[i];
            
            

        }
    }
}