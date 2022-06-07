package Aula;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //2- Faça um algoritmo que receba o nome e a idade de uma pessoa e ao final mostre os
        //valores digitados.
        Scanner ler = new Scanner(System.in);
        String nome;  int idade;

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Nome: "+(nome));
        System.out.println("Idade: "+(idade));
        ler.close();
       
    }
    
}
