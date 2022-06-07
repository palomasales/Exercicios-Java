import java.util.Scanner;

public class ex04 {

    public static void main(String[] args){
        /*4. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de
        vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma
        pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ
        VIVEU 6935 DIAS*/

        Scanner ler = new Scanner(System.in);
        String nome; int idade; int qtd_dias;

        System.out.println("Digite seu nome....:");
        nome = ler.nextLine();
        System.out.println("Digite sua idade...:");
        idade = ler.nextInt();

        qtd_dias = idade*365;

        System.out.println(""+nome+", você já viveu "+qtd_dias+" dias");
        ler.close();

    }
    
}
