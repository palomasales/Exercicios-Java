import java.util.Scanner;

public class ex15 {

    public static void main(String[]args){
        /*15. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
        funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. */

        Scanner ler = new Scanner(System.in);
        double salario;

        System.out.print("Digite seu salario atual...:");
        salario = ler.nextFloat();

        salario = salario/1.212;

        System.out.println("Você ganha "+String.format("%.1f", salario)+" salarios minimos");

        ler.close();
    }
    
}
