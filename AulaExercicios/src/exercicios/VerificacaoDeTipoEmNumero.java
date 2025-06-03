package exercicios;
import java.util.Scanner;

public class VerificacaoDeTipoEmNumero {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("O seu número é positivo");
        } else if (num == 0) {
            System.out.println("O seu número é zero.");
        } else {
            System.out.println("O seu número é negativo.");
        }

        scanner.close();

    }

}
