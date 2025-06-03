package Curso_Fora;
import java.util.Scanner;
import java.util.Arrays;

public class JogoDaForca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] respostaForca = {"J", "A", "V", "A"};
        String[] telaForca     = {"_", "_", "_", "_"};

        final int tentativasMax = 6;
        int tentativasRestantes = tentativasMax;

        while (tentativasRestantes > 0) {
            System.out.println("\nPalavra: " + String.join(" ", telaForca));
            System.out.print("Tentativas restantes: " + tentativasRestantes +
                             "\nQual letra você deseja: ");
            String chute = scanner.nextLine().trim().toUpperCase();

            boolean acertou = false;

            for (int j = 0; j < respostaForca.length; j++) {
                if (chute.equals(respostaForca[j])) {
                    telaForca[j] = respostaForca[j]; // revela letra
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Não tem essa letra.");
                tentativasRestantes--;
            }

            // verifica se ganhou
            if (Arrays.equals(telaForca, respostaForca)) {
                System.out.println("\nParabéns! Você descobriu: " +
                                   String.join("", respostaForca));
                break;
            }
        }

        if (!Arrays.equals(telaForca, respostaForca)) {
            System.out.println("\nSuas tentativas acabaram. A palavra era " +
                               String.join("", respostaForca) + ".");
        }

        scanner.close();
    }
}
