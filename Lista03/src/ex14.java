import java.util.Scanner;

public class ex14 {

    public static void main(String[]args){
        /*14. Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e mostre esse peso
        em gramas. */

        Scanner ler = new Scanner(System.in);
        float peso, grama;

        System.out.print("Digite seu peso atual........:");
        peso = ler.nextFloat();

        grama = peso*(float)1.000;

        System.out.println("Seu peso atual em gramas...:"+String.format("%.3f", grama));

        ler.close();

    }
    
}
