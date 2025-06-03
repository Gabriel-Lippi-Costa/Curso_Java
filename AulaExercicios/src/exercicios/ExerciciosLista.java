package exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosLista {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Deseja adicionar quantos números na lista? ");
        int quantidadeLista = scanner.nextInt();

        int[] numeros = new int[quantidadeLista];

        for(int i = 0; i < quantidadeLista; i++) {

            System.out.println("Digite um número para adicionar na lista: ");
            int valor = scanner.nextInt();

            numeros[i] = valor;

        }

        int[] numerosInvertido = new int[quantidadeLista];

        for (int i = 0; i < quantidadeLista; i++) {

            numerosInvertido[i] = numeros[quantidadeLista - 1 - i];

        }

        System.out.println("A sua lista ficou assim: " + Arrays.toString(numeros));
        System.out.println("A sua lista invertida ficou assim: " + Arrays.toString(numerosInvertido));

        scanner.close();

    }

}
