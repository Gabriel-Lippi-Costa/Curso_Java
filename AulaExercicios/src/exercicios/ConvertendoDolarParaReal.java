package exercicios;
import java.util.Scanner;

public class ConvertendoDolarParaReal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você tem quantos dólares?");
        double dolar = scanner.nextDouble();

        double conversao = dolar * 5.73;

        System.out.println("Você ficou com R$" + conversao + " reais.");


        scanner.close();
    }

}
