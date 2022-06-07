import java.util.Scanner;

public class ex12 {

    public static void main(String[]args){
        /*12. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um
        algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e
        mostre a comissão e o salário final do funcionário. */

        Scanner ler = new Scanner(System.in);
        double sal_fixo, sal_final, vendas;
        double comissao;

        System.out.print("Digite seu salario fixo...........:");
        sal_fixo = ler.nextDouble();
        System.out.print("Digite o valor das suas vendas....:");
        vendas = ler.nextDouble();

        comissao = vendas*0.04;
        sal_final = comissao+sal_fixo;

        System.out.println("Comissão sobre as vendas..........: R$"+String.format("%.2f", comissao));
        System.out.println("Salario Final.....................: R$"+String.format("%.2f", sal_final));

        ler.close();
    }
    
}
