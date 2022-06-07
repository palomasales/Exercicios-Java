package Aula;

import java.util.Scanner;

public class aula02 {
      /*
    Crie um algoritmo que receba dois numeros e ao final
    mostre a soma entre eles
    */
    public static void main(String[] args) {
        //Instancia da biblioteca Scanner
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro valor: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = ler.nextInt();
        System.out.println("O total: "+(n1+n2));
        ler.close();
        
    }
}