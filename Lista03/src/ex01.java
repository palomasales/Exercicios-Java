import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em
         * 15%. Após o aumento, desconte 8% de impostos. Ao final escrever o salário
         * inicial, o salário com o aumento e o salário final.
         */

        Scanner ler = new Scanner(System.in);
        float salario;
        float salario_aumento;
        float salario_final;

        System.out.println("Digite o salario do funcionário...:");
        salario = ler.nextFloat();

        salario_aumento = (salario * (float)0.15) + salario;
        salario_final = (salario_aumento - (salario_aumento * (float)0.08));

        System.out.println("Salario inicial...................:R$" + salario);
        System.out.println("Salario com aumento...............:R$" + salario_aumento);
        System.out.println("Salario final.....................:R$" + salario_final);

        ler.close();
    }
}
