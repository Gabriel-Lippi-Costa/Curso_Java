package exercicios;
import java.util.Scanner;

public class DescobrirMaiorNumero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Celsius para: Celsius -> Fahrenheit");
        System.out.println("Digite Fahrenheight para: Fahrenheight -> Celsius");
        String tipoTemperatura = scanner.nextLine();

        if (tipoTemperatura.equals("Celsius")) {

            ConversorCelsius();

        } else if (tipoTemperatura.equals("Fahrenheight")) {
            
            ConversorFahrenheight();

        } else {

            System.out.println("Valor inválido!");
        
        }

        scanner.close();

    }

    public static void ConversorCelsius() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite apenas o número(s) da sua temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        double convercao = celsius * 1.8 + 32;

        System.out.println("O resultado da sua conversão foi de: " + convercao + "F.");
        
        scanner.close();

    }

    public static void ConversorFahrenheight() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite apenas o número(s) da sua temperatura em Fahrenheight:");
        double fahrenheight = scanner.nextDouble();

        double conversao = (fahrenheight - 32) / 1.8;

        System.out.println("O resultado da sua conversão foi de: " + conversao + "°C.");

        scanner.close();

    }

}
