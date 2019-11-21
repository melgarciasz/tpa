import java.util.*;
public class Exercicio11{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int [10];
        int i, b, c = 0;

        for(i = 0; i<10; i++){
            System.out.println("Informe o numero da" +(i+1)+"ª Posição");
            a[i] = ler.nextInt();
        }
        System.out.println("Numeros colocados");
        System.out.println("Insira o numero a pesquisar:");
        b = ler.nextInt();
        
        for(i = 0; i<10; i++){
            if(b==a[i]){
                r++;
                System.out.println("Seu numero está na "+(i+1)+" posição");
            }
        }
        if(c==0){
            System.out.println("Erro");
        }
    }   
}