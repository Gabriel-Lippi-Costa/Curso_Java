package exercicios;
import java.util.Scanner;

public class CalculoQuadradoQuatroNumeros {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número:");
        int n1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo número:");
        int n2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro número:");
        int n3 = scanner.nextInt();

        System.out.println("Digite o valor do quarto número:");
        int n4 = scanner.nextInt();

        n1 = (int) Math.pow(n1, n1);
        n2 = (int) Math.pow(n2, n2);
        n3 = (int) Math.pow(n3, n3);
        n4 = (int) Math.pow(n4, n4);

        int somarQuadrados = n1 + n2 + n3 + n4;

        System.out.println("O valor foi de: " + somarQuadrados);




        scanner.close();

    }

}
