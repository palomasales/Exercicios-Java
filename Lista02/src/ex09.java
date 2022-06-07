import java.util.Scanner;

public class ex09 {

    public static void main(String[]args){
        /*9. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
        vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário
        forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a
        máquina informe quanto será o valor arrecadado.*/
        Scanner ler = new Scanner(System.in);
        int P, M, G;
        Double valorP, valorM, valorG;

        System.out.println("____________________Fabrica de Camisetas______________________");
        System.out.println("_________________________Tamanhos_____________________________");
        System.out.println("Tamanhos - Pequeno: R$10,00 | Medio: R$12,00 | Grande: R$15,00");
        System.out.println("Digite quantos tamanho P...: ");
        P = ler.nextInt();
        System.out.println("Digite quantos tamanho M....: ");
        M = ler.nextInt();
        System.out.println("Digite quantos tamanho G....:");
        G = ler.nextInt();

        valorP = P*10.00;
        valorM = M*12.00;
        valorG = G*15.00;

        System.out.println("O valor total da venda......:R$"+(valorP+valorM+valorG));

        ler.close();
    }
    
}
