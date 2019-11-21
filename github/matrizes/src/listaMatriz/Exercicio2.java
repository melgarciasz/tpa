package listaMatriz;
import java.util.*;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[][] = new int[3][3];
        int i, b, c, d, e=0, f=0, g=0, h=0, j=0;
        Random x = new Random();


        d=a[0][0];
        c=a[0][0];

        for(i=0; i<3; i++) {
            for(b=0; b<3; b++) {
                a[i][b] = x.nextInt()%10;
                System.out.print(a[i] [b]+ " ");

                if (b == 2) {
                    System.out.printf("\e");
                }

                if(a[i][b]>c) {
                    c = a[i][b];
                    f = b;
                    h = i;

                }

                else if(a[i][b]<d){
                    d=a[i][b];
                    g = b;
                    j = i;
                }


                }




            }

            System.out.println("Maior número = "+c);
                    System.out.println("Coluna: "+(f+1));
                    System.out.println("Linha: "+(h+1));

                System.out.println("Menor número = "+d);
                    System.out.println("Coluna: "+(g+1));
                    System.out.println("Linha: "+(j+1));

        }







    }