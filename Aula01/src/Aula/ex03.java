package Aula;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        /* 
         3- Faça um algoritmo que: 
         Leia o nome; 
         Leia o sobrenome; 
         Junte o nome com o sobrenome;
         Apresente o nome completo.
        */
        Scanner ler = new Scanner(System.in);
        String nome; String sobrenome;

        System.out.println("Digite seu primeiro nome....: ");
        nome = ler.nextLine();
        System.out.println("Digite seu sobrenome........: ");
        sobrenome = ler.nextLine();
        System.out.println("Seu nome e sobrenome........: "+(nome)+(sobrenome));
        ler.close();


    }
    
}
