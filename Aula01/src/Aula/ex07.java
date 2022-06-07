package Aula;

import java.util.Scanner;

import java.text.NumberFormat;
import java.util.Locale;

public class ex07 {

    public static void main(String[] args){

        Locale localeBR = new Locale("pt","BR");
        /*7- Faça um algoritmo que:
            Obtenha o valor para a variável HT (horas trabalhadas no mês);
            Obtenha o valor para a variável VH (valor hora trabalhada):
            Obtenha o valor para a variável PD (percentual de desconto);
            Calcule o salário bruto => SB = HT * VH;
            Calcule o total de desconto => TD = (PD/100)*SB;
            Calcule o salário líquido => SL = SB – TD;
            Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
            Liquido.*/
    Scanner ler = new Scanner(System.in);
        int HT; double VH; float PD; double SB; double TD; double SL;

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);


        System.out.println("Digite as horas trabalhas do mês do funcionario....:");
        HT = ler.nextInt();
        System.out.println("Digite o valor por hora trabalhada.................:");
        VH = ler.nextDouble();
        System.out.println("Digite o percentual de desconto....................:");
        PD = ler.nextFloat();
 
        SB = (HT*VH);
        TD = (PD/100)*SB;
        SL = (SB-TD);

        System.out.println(".................HOLERITE FUNCIONARIO................");
        System.out.println("Horas trabalhadas......:"+HT);
        System.out.println("Salário Bruto..........:"+dinheiro.format(SB));
        System.out.println("Desconto...............:"+dinheiro.format(TD));
        System.out.println("Salário Liquido........:"+dinheiro.format(SL));

        ler.close();
    }
}
