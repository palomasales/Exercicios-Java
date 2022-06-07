import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        /*01. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
dimensões de um terreno e depois exibir a área do terreno.*/

        Scanner ler = new Scanner(System.in);
        float area ;float largura ;float comprimento ;

        System.out.println("Digite quantos metros de largura consta o terreno......:");
        largura = ler.nextFloat();
        System.out.println("Digite quantos metros de comprimento consta o terreno..:");
        comprimento = ler.nextFloat();
   
        area = largura*comprimento;
        
        System.out.println("O Terreno possui "+area+" metros quadrados");
        ler.close();
    }
}
