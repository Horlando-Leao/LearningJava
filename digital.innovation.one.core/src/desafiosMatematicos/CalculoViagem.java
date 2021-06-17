package desafiosMatematicos;

import java.util.Scanner;

public class CalculoViagem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float velocidadeMedia = scan.nextFloat();
        float tempoPercorrido = scan.nextFloat();

        System.out.printf("%.3f\n", (  velocidadeMedia * tempoPercorrido  )/12.0);
    }
}
