package exercicios;
import java.util.Scanner;

public class Treino {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Exercício 1
        /*
        System.out.println("Digite alguma coisa:");
        String frase = scanner.nextLine();

        System.out.println("A sua frase possui " + frase.length() + " caracteres.");*/

        // Exercício 2
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("A raiz quadrada do seu primeiro número é de " + Math.sqrt(num1));

        System.out.println("O resultado do segundo número elevado ao primeiro é de " + Math.pow(num2, num1));

        scanner.close();

    }

}
