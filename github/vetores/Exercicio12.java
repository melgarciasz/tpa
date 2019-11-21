import java.util.*;
public class Exercicio12{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int i, b, c = 0;

        for(i = 0; i<10; i++){
            System.out.println("Insira o numero da "+(i+1)+" Posição:");
            a[i] = ler.nextInt();
        }
        
        for(i = 0, b = 9; i<10 && b>-1; i++, b--){
            if(a[i] == a[b]){
                c++;
            }
        }
        
        if(c>=10){
            System.out.println("É um Palíndromo");
        }

        else{
            System.out.println("Não é um Palíndromo");
        }
    }
}