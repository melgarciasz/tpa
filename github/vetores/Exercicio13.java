import java.util.*;
public class Exercicio13{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int i;

        for(i = 0; i<10; i++){
            System.out.println("Insira o numero da "+(i+1)+" Posição");
            a[i] = ler.nextInt();

            if(a[i]%2 == 0){
                b[i] = 1;
            }

            else{
                b[i] = 0;
            }

            System.out.println("B[ ");
            for(i = 0; i<10; i++){
                System.out.printf(" %d",b[i]);
            }
            System.out.printf(" ]");
        }
        
    }
}