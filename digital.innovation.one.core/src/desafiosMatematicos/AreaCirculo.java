package desafiosMatematicos;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = Double.parseDouble(scan.nextLine());

        System.out.printf("A=%.4f\n", areaCirculo(raio));
    }

    public static double areaCirculo(double raioCirculo){
        double areaCirculo;

        areaCirculo =  (3.14159 * (raioCirculo * raioCirculo));
        return areaCirculo;
    }

}
