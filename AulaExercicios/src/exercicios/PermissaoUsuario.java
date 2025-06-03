package exercicios;
import java.util.Scanner;

public class PermissaoUsuario {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        permissao(idade);        

        scanner.close();

    }

    public static void permissao(int idade) {

        if (idade >= 18) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
            System.exit(0);
        }

    }

}
