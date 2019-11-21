import java.util.*;
public class Exercicio1{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[],b[],i;
        a = new int [6];
        b = new int [6];
        
        
            for (i = 0;i<=5;i++) {
                System.out.println("Digite os valores ");
                a[i] = in.nextInt();	
            }
            
            
            for (i = 0;i<=5;i++) {
                if (a[i] % 2 == 0) {
                    b[i] = a[i];
                    System.out.println(b[i]);
                }
            }
            
            for (i = 0;i<=5;i++) {
                if (a[i] % 2 != 0) {
                    b[i] = a[i];
                    System.out.println(b[i]);
                }
        
           }
    }
}