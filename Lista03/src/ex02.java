import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        /*
         * 2. Três amigos, Carlos, André e Felipe, decidiram rachar igualmente a conta
         * de um bar. Faça um algoritmo para ler o valor total da conta e imprimir
         * quanto cada um deve pagar.
         */

        Scanner ler = new Scanner(System.in);
        float conta;
        float conta_div;

        System.out.println("Digite o total da conta....:");
        conta = ler.nextFloat();

        conta_div = conta/3;

        System.out.println("Cada um deve pagar.........:R$"+String.format("%.2f", conta_div));

        ler.close();
    }

}
