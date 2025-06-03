package Curso_Fora;

import java.util.Arrays;
import java.util.Comparator;

public class AulaJava {
    
    public static void main(String[] args) {
        
        Integer lista[] = {1, 2, 3, 4, 5, 6};

        Arrays.sort(lista, Comparator.reverseOrder());

        System.out.println(Arrays.toString(lista));

    }

}
