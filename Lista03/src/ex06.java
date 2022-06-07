import java.util.Scanner;

public class ex06 {

    public static void main(String[] argss){
        /*6. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml,
        garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada
        quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele
        comprou.*/

        Scanner ler = new Scanner(System.in);
        float lata_qtd, garrafa_600qtd, garrafa_2lqtd;
        float lata, garrafa600, garrafa2l;
        float somalitros;

        System.out.println("_______________________Fabrica Meia-Cola_______________________");
        System.out.println("faça seu pedido a baixo e informe a quantidade de cada produto:");
        System.out.println("Refrigerante lata - 350ml........:");
        lata_qtd = ler.nextInt();
        System.out.println("Garrafa de refrigerante - 600ml..:");
        garrafa_600qtd = ler.nextInt();
        System.out.println("Garrafa de refrigerante - 2L.....:");
        garrafa_2lqtd = ler.nextInt();

        lata = lata_qtd*(float)0.350;
        garrafa600 = garrafa_600qtd*(float)0.600;
        garrafa2l = garrafa_2lqtd*(float)2.000;
        somalitros = lata+garrafa600+garrafa2l;

        System.out.println("Você realizou a compra de "+somalitros+" litros de refrigerante");

        ler.close();
    }

}
