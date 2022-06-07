import java.util.Scanner;

public class ex09 {
    
    public static void main(String[] args){
        /*9. Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro número
        pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto não é necessário se
        preocupar com validações.*/
        Scanner ler = new Scanner(System.in);
        int n1,n2,total;

        System.out.println("Digite dois numeros:");
        n1 = ler.nextInt();
        n2 = ler.nextInt();

        total = n1*n2;
        System.out.println("Resultado da multiplicação:"+total);

        ler.close();
    }
}
