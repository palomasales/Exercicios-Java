package Aula;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        /*4- Faça um algoritmo que:
            Leia um número inteiro;
            Leia um segundo número inteiro;
            Efetue a adição dos dois valores;
            Apresente o valor calculado.*/

    Scanner ler = new Scanner(System.in);
        int num1; int num2;

        System.out.println("Digite o primeiro numero.....:");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero......:");
        num2 = ler.nextInt();

        System.out.println("O resultado da soma..........:"+(num1+num2));
        ler.close();
        

    
    }
}
