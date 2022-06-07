import java.util.Scanner;

public class ex10 {

    public static void main(String[]args){
        /*10. Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas
        notas, considerando peso 2 para a primeira nota e peso 3 para a segunda nota.*/

        Scanner ler = new Scanner(System.in);
        Float n1, n2;
        Float media_n1, media_n2;
        Float media;

        System.out.println("........Disciplina: Biologia.........");
        System.out.println("Nota Trabalho 1..:"); n1 = ler.nextFloat();
        System.out.println("Nota Trabalho 2..:"); n2 = ler.nextFloat();
      

        media_n1 = n1*2;
        media_n2 = n2*3;
        media = media_n1+media_n2;

        System.out.println("Resultado da media..:"+media);
        ler.close();

    }
    
}
