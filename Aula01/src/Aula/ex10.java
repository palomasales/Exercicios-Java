package Aula;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        /*10- Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo,
        utilizando a fórmula VOLUME = 3,14159 * (RAIO²) * ALTURA.*/

        Scanner ler = new Scanner(System.in);
        float volume; float raio; float altura;

        System.out.println("Digite o valor do Raio.....:");
        raio = ler.nextFloat();
        System.out.println("Digite o valor da Altura...:");
        altura = ler.nextFloat();

        volume =(float)3.14159 * ((raio*raio) * altura);

        System.out.println("O valor do volume da lata de oleo...:"+volume);

        ler.close();

    }
}
