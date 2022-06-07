import java.util.Scanner;

public class ex07 {

    public static void main(String[] args){
        /*7. Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
        poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor
        total economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e
        ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.*/

        Scanner ler = new Scanner(System.in);
        double m1c, m5c, m10c, m25c, m50c, m1r, totalm;
        int qtd_m1c, qtd_m5c, qtd_m10c, qtd_m25c, qtd_m50c, qtd_m1r;


        System.out.println("Digite a quantidade de cada tipo/valor de moeda a baixo: ");
        System.out.print("Moedas de R$ 0,01 centavos....: ");
        qtd_m1c = ler.nextInt();
        System.out.print("Moedas de R$ 0,05 centavos....: ");
        qtd_m5c = ler.nextInt();
        System.out.print("Moedas de R$ 0,10 centavos....: ");
        qtd_m10c = ler.nextInt();
        System.out.print("Moedas de R$ 0,25 centavos....: ");
        qtd_m25c = ler.nextInt();
        System.out.print("Moedas de R$ 0,50 centavos....: ");
        qtd_m50c = ler.nextInt();
        System.out.print("Moedas de R$ 1,00 real........: ");
        qtd_m1r = ler.nextInt();

        m1c = qtd_m1c*0.01;
        m5c = qtd_m5c*0.05;
        m10c = qtd_m10c*0.10;
        m25c = qtd_m25c*0.25;
        m50c = qtd_m50c*0.50;
        m1r = qtd_m1r*1.00;
        totalm = m1c+m5c+m10c+m25c+m50c+m1r;

        System.out.print("Você conseguiu poupar........: R$"+String.format("%.2f", totalm));

        ler.close();
    }
    
}
