import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class ex06 {

    public static void main (String[]args){
        /*6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um
        algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
        Assuma que a balança já desconte o peso do prato.*/

        Scanner ler = new Scanner(System.in);
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        Float quilo;
        Double valor_quilo;

        System.out.println("Digite quantos quilos(kg) seu prato deu...: ");
        quilo = ler.nextFloat();

        valor_quilo = (quilo*12.00);

        System.out.println("O valor do prato ficou................:"+dinheiro.format(valor_quilo));
        ler.close();

    }
    
}
