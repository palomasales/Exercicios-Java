package Aula;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args){

    /*5- Faça um algoritmo para calcular a área de uma circunferência, considerando a fórmula
    ÁREA = π * RAIO² . Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159) e os
    operadores aritméticos de multiplicação.*/
    Scanner ler = new Scanner(System.in);
    Float area; Float raio; Float pi;
    

    System.out.println("......Calcule a área de uma circunferência......");

    System.out.println("Digite o RAIO....:");
    raio = ler.nextFloat();

    pi=(float)3.14159;
    area=(pi*(raio*raio));

    System.out.println("Resultado da área da circunferência.....:"+area);
    ler.close();
    }
}