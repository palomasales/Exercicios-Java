package Aula;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args){
        /*6 - Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula AREA =
        (BASE*ALTURA)
        /2 .Utilize as variáveis AREA, BASE e ALTURA e os operadores
        aritméticos de multiplicação e divisão.*/
        
        Scanner ler = new Scanner(System.in);
        Float area; Float base; Float altura;

        System.out.println("......Calcule a área de um triângulo......");
        System.out.println("Digite a Base......:");
        base = ler.nextFloat();
        System.out.println("Digite a Altura....:");
        altura = ler.nextFloat();
        
        area=(base*altura);
        System.out.println("O resultado da area do triangulo.....:"+area);
        ler.close();


    }
}
