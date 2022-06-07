import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ex05 {

    public static void main(String[] args){
        /*5. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para
        ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu
        colocar no tanque.*/

        Locale localeBR = new Locale("pt","BR");
        Scanner ler = new Scanner(System.in);
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        double preco_litro;
        double valor_gasolina;
        double pagamento;
        int qtd_litros;

        System.out.println("Digite o valor do litro da gasolina.....................:");
        preco_litro = ler.nextDouble();
        System.out.println("Digite quantos reais você deseja colocar de gasolina....:");
        valor_gasolina = ler.nextDouble();
        
        pagamento = preco_litro*valor_gasolina;
        qtd_litros = (int)(valor_gasolina/preco_litro);

        System.out.println("Você deve pagar......:"+dinheiro.format(pagamento)+" e colocou "+qtd_litros+" litros no tanque");
        ler.close();
    }
    
}
