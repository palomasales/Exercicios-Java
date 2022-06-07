import java.util.Scanner;

public class ex08 {

    public static void main(String[]args){
        /*8. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média
        ponderada (as notas tem pesos respectivos de 1, 2 e 3).*/
        Scanner ler = new Scanner(System.in);
        Float n1, n2, n3;
        Float media_n1, media_n2, media_n3;
        Float media;

        System.out.println("........Disciplina: Biologia.........");
        System.out.println("Nota Trabalho 1..:"); n1 = ler.nextFloat();
        System.out.println("Nota Trabalho 2..:"); n2 = ler.nextFloat();
        System.out.println("Nota Trabalho 3..:"); n3 = ler.nextFloat();

        media_n1 = n1*1;
        media_n2 = n2*2;
        media_n3 = n3*3;
        media = media_n1+media_n2+media_n3;

        System.out.println("Resultado da media..:"+media);
        ler.close();

    }
    
}
