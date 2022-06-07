package Aula;

import java.util.Scanner;

public class ex08{

    public static void main(String[] args){
        /*8- Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
        convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na
        qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius.*/

        Scanner ler = new Scanner(System.in);
        Float F; Float C;

        System.out.println(".....Conversão de Celsius para Fahrenheit......");
        System.out.println("Digite a temperatura em Celsius...:");
        C = ler.nextFloat();

        F = (9 * C + 160)/5;

        System.out.println("A temperatura em Celsius: "+C+" convetido para Fahrenheit..: "+F);
        
        ler.close();

         }
    }