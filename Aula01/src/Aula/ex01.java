package Aula;

import java.util.Scanner;

public class ex01 {
//1- Faça um algoritmo que receba dois números inteiros e mostre a subtração entre eles.
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n1, n2;
    System.out.println("Digite o primeiro valor: ");
    n1 = ler.nextInt();
    System.out.println("Digite o segundo valor: ");
    n2 = ler.nextInt();
    System.out.println("O resultado da subtração: "+(n1-n2));
    ler.close();

    }
}
