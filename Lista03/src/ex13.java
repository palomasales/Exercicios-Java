import java.util.Scanner;

public class ex13 {
    
    public static void main(String[]args){
        /*13. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
              a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
              b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado. */

        Scanner ler = new Scanner(System.in);
        float eng, ema, peso;

        System.out.print("Digite seu peso atual...:");
        peso = ler.nextFloat();

        eng = peso+(peso*(float)0.15);
        ema = peso+(peso*(float)0.20);

        System.out.println("- Seu peso sera "+eng+"Kg caso você engorde 15%");
        System.out.println("- Seu peso sera "+ema+"Kg caso você emagreça 20%");

        ler.close();
    }
}
