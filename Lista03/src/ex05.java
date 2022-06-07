import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        /*
         * 5. A empresa Hipotheticus paga R$15,00 por hora trabalhada. Faça um algoritmo
         * para receber a quantidade de horas trabalhadas e mostrar ao final o salário
         * bruto e o salário líquido de um determinado funcionário. O salário líquido é
         * igual ao salário bruto descontando-se 10% de impostos.
         */
        Scanner ler = new Scanner(System.in);
        int horas_trabalhadas; double sal_bruto, sal_liq;

        System.out.println("Digite a quantidade de horas trabalhadas...:");
        horas_trabalhadas = ler.nextInt();

        sal_bruto = horas_trabalhadas*15.00;
        sal_liq = sal_bruto-(sal_bruto*0.10);

        System.out.println("Salario bruto.............................: R$"+String.format("%.2f", sal_bruto));
        System.out.println("Salario liquido descontado 10% de impostos: R$"+String.format("%.2f", sal_liq));

        ler.close();
    }

}
