import java.util.*;
public class Exercicio10{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int [10];
        int b[] = new int [10];
        int c[] = new int [10];
        int i, e, p = 0;

        for(i = 0; i<10; i++){
            System.out.printf("Informe o %d numero do vetor A\n", (i+1));
            a[i] = ler.nextInt();
            System.out.printf("Informe o %d numero do vetor B\n", (i+1));
            b[i] = ler.nextInt();

        }

        for(e = 0; e<10; e++){
            for(i = 0, d = 0; i<10; i++){
                if(a[e] != b[i]){
                    d++;
                }

                if(d>=10){
                    c[e] = a[e];
                }


            }
        }

        System.out.print("C[");
        for(e = 0; e<10; e++){
            System.out.printf(" %d" ,c[e]);
        }
        System.out.println("]");



    }

}


