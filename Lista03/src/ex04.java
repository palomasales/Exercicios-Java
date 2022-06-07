import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        /*
         * 4. A granja Frangotech possui um controle automatizado de cada frango da sua
         * produção. No pé direito do frango há um anel com um chip de identificação; no
         * pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve
         * consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa
         * R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
         * todos os seus frangos.
         */
        Scanner ler = new Scanner(System.in);
        int frango_qtd;
        float anel_id =(float)4.00 ;
        float chip_alim = (float)7.00 ;
        float total;

        System.out.println("Digite quantos frangos será comprados...:");
        frango_qtd = ler.nextInt();

        total = (anel_id*frango_qtd)+(chip_alim*frango_qtd);
        System.out.println("Gasto total.............................:R$ "+String.format("%.2f", total));

        ler.close();
    }
}
