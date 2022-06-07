import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        /*
         * 3. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio
         * inclui duas fatias de queijo, uma fatia de presunto e uma rodela de
         * hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e
         * que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono
         * forneça a quantidade de sanduíches a fazer, e a máquina informe as
         * quantidades (em quilos) de queijo, presunto e carne necessários para compra.
         */
        Scanner ler = new Scanner(System.in);
        float queijo = (float)0.100;
        float presunto = (float)0.050;
        float hamburguer = (float)0.100;
        int sanduiche_qtd;

        System.out.println("Digite a quantidade de sanduíches irá fazer...:");
        sanduiche_qtd = ler.nextInt();

        System.out.println(".....Será necessario comprar (em quilos).....");
        System.out.println("Queijo.....:"+(queijo*sanduiche_qtd)+" kg");
        System.out.println("Presunto...:"+(presunto*sanduiche_qtd)+" kg");
        System.out.println("Hamburguer.:"+(hamburguer*sanduiche_qtd)+" kg");

        ler.close();
    }

}
