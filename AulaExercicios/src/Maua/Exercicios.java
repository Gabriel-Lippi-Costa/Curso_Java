import javax.swing.JOptionPane;

public class Exercicios {
    public static void main(String[] args) {
        
    int numero, soma = 0, maior = 0;
    double par = 0;

    do {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero > 0) {
            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
            if (numero % 2 == 0) {
                par = par + soma;
            }

        } 

    } while (numero > 0);
    System.out.printf("Soma: %d\n", soma);
    System.out.printf("Maior: %d\n", maior);
    System.out.print(par);
    
    

}
}
