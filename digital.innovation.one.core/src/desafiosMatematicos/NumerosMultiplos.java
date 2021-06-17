package desafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;

public class NumerosMultiplos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int valorA = leitor.nextInt();
        int valorB = leitor.nextInt();

        if ( getMultiplo(valorA, valorB) ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }

    public static boolean getMultiplo(int valorA, int valorB){

        int numeroMaior = 0;
        int numeroMenor = 0;

        valorA = Math.abs(valorA);
        valorB = Math.abs(valorB);

        if(valorA > valorB){
            numeroMaior = valorA;
            numeroMenor = valorB;
        }else if(valorA < valorB){
            numeroMaior = valorB;
            numeroMenor = valorA;
        } else{
            return true;
        }

        for (int i = 0; i <= numeroMaior; i++){
            if( (numeroMenor * i)  == numeroMaior){
                return true;
            }
        }
        return false;
    }
}
