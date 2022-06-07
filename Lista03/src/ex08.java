import java.util.Scanner;

public class ex08 {
   
    public static void main(String[] args){
        /*8. Faça um algoritmo que receba três números, calcule e mostre a multiplicação desses
        números.*/

        Scanner ler = new Scanner(System.in);
        int n1,n2,n3, total;

        System.out.println("Digite três numeros:");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        total = n1*n2*n3;
        System.out.println("Resultado da multiplicação desses numeros: "+total);
        
        ler.close();

    }
}
