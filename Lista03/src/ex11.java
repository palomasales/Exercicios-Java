import java.util.Scanner;

public class ex11 {
    public static void main(String[]args){
        /*11. Faça um algoritmo que receba o preço de um produto, calcule e mostre o novo preço,
        sabendo-se que este sofreu um aumento de 10%.*/

        Scanner ler = new Scanner(System.in);
        double produto; double aumento; String nomep;

        System.out.println("Digite o nome do produto e o seu valor a baixo:");
        System.out.print("Nome...............: ");
        nomep = ler.nextLine();
        System.out.print("Valor do produto...: ");
        produto = ler.nextDouble();

        aumento = produto+(produto*(float)0.10);

        System.out.println("O "+nomep+" sofreu um aumento de 10% e está no valor de R$"+String.format("%.2f", aumento)+". ");

        System.out.println();

        ler.close();

    }  
}
