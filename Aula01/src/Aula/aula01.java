package Aula;
//Importar biblioteca do Scanner (Leitura dos valores)
import java.util.Scanner;

public class aula01 {
    /*
    Crie um algoritmo que receba o nome, a idade e o 
    salario de uma pessoa e mostre os valores digitados ao final
    */
    public static void main(String[] args) {
        //Instancia da biblioteca Scanner
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        float sal;
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite seu salário: ");
        sal = ler.nextFloat();

        System.out.println("O nome digitado: "+nome);
        System.out.println("A idade digitada: "+idade);
        System.out.println("O salário digitado: "+sal);
        ler.close();
        
    }
    
}
