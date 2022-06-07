import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        /*
         * 2. Faça um algoritmo para calcular quantas ferraduras são necessárias para
         * equipar todos os
         * cavalos comprados para um haras.
         */

        Scanner ler = new Scanner(System.in);
        int qtd_ferradura;
        int qtd_cavalos;

        System.out.println("Digite quantos cavalos foram comprados...:");
        qtd_cavalos = ler.nextInt();

        qtd_ferradura = qtd_cavalos * 4;

        System.out.println(
                "Vão ser utilizados " + qtd_ferradura + " ferraduras para equipar os " + qtd_cavalos + " cavalos");
        ler.close();

    }
}
