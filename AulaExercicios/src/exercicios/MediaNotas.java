package exercicios;

import javax.swing.JOptionPane;

public class MediaNotas {

    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        double resultado = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A sua média teve a nota de " + resultado + " pontos.");

    }

}