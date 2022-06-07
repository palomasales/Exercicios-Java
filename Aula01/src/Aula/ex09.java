package Aula;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        /*9- Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente convertida
        em graus Celsius. A fórmula de conversão é C = (F - 32) * ( 5 / 9), na qual F é a
        temperatura em Fahrenheit e C é a temperatura em Celcius.*/

        Scanner ler = new Scanner(System.in);
        Float F; Float C;

        System.out.println(".....Conversão de Fahrenheit para Celsius......");
        System.out.println("Digite a temperatura em Fahrenheit...:");
        F = ler.nextFloat();

        C = ((F - 32)/(float)1.8);

        System.out.println("A temperatura em Fahrenheit: "+F+" convetido para Celsius..: "+C);
        
        ler.close();

    }
    
}
