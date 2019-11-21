import java.util.Scanner;
public class Exercicio6{
        public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
    
        int a[] = new int [11];
    
        int i, base=1, d=1, e=0;
    
    
        for(i=0; i<11; i++){
    
            a[i] = i;
    
            if(a[i]==0){
    
            e = 1;
    
    
            }
    
            else{
    
                for(base = 1,d=1; n<=a[i]; d++){
    
                    base = base * 2;
                }
                for (d=1; d<=a[i];d++) {
                    a[i] = base;
                }
    
    
            System.out.println(a[i]);
    
            }
    
    
        }
    }
    
    }