import java.util.Scanner;

public class ex07 {

    public static void main(String[]args){
        /*7. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do
        ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.*/
        
        Scanner ler = new Scanner(System.in);
        int dia;
        int mes;
        int dias;

        System.out.println("Digite o dia....:");
        dia = ler.nextInt();
        System.out.println("Digitw o mês....:");
        mes = ler.nextInt();

        dias = mes*30-dia;

        System.out.println("Passou "+dias+" dias desde o inicio do ano.");
        ler.close();

        

    }
    
}
