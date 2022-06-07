import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ex03 {

    public static void main(String[] args) {        
        /*
         * 3. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de
         * broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono
         * quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar
         * numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos
         * para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de
         * broas, e depois calcular os dados solicitados.
         */
        Locale localeBR = new Locale("pt","BR");
        Scanner ler = new Scanner(System.in);

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        double total_pfrances_broa;
        double poupanca;
        int qtd_pfrances; 
        int qtd_broa; 

        System.out.println("Digite quantos pães franceses foram vendidos no dia...:");
        qtd_pfrances = ler.nextInt();
        System.out.println("Digite quantas broas foram vendidos no dia............:");
        qtd_broa = ler.nextInt();

        total_pfrances_broa = (qtd_pfrances*0.12)+(qtd_broa*1.50);
        poupanca = total_pfrances_broa*0.1;
        
        System.out.println("Você arrecadou "+dinheiro.format(total_pfrances_broa)+" no dia");
        System.out.println("Você deve guardar "+dinheiro.format(poupanca)+" na poupança");

        ler.close();
    }

}
