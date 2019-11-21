import java.util.*;
public class Exercicio3{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[],i,a1,b1 = 1;
        a = new int [11];
        for (i = 1;i<=10;i++) {
            System.out.println("Digite os valores");
            a[i] = in.nextInt();

            for (a1 = 0,b1 = 1;b1<=a[i];b1++) {
                if (a[i] % b1 == 0) {

                    a1++;
                }

            }
            System.out.println(d);
            if(a1 <= 2) {
                System.out.println("É Primo");
            }
            else {
                System.out.println("Não é primo");
            }
        }
    }
}
