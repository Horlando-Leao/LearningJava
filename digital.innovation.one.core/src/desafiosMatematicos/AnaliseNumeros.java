package desafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnaliseNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare suas variaveis corretamente
        int  valorA = Integer.parseInt(leitor.nextLine());
        int  valorB = Integer.parseInt(leitor.nextLine());
        int  valorC = Integer.parseInt(leitor.nextLine());
        int  valorD = Integer.parseInt(leitor.nextLine());
        int  valorE = Integer.parseInt(leitor.nextLine());
        List<Integer> listaValores = new ArrayList();

        listaValores.addAll(Arrays.asList(valorA, valorB, valorC, valorD, valorE));
        analiseNumerica(listaValores);
    }

    public static void analiseNumerica(List<Integer> listaValores){
        //continue a solução
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        int elemento = 0;
        for (int i= 0; i < listaValores.size(); i++) {
            elemento = listaValores.get(i);

            if (elemento%2 == 0){
                pares++;
            }else{
                impares++;
            }

            if (elemento > 0){
                positivos++;
            }else if(elemento < 0){
                negativos++;
            }
        }
        //insira suas variaveis corretamente
        System.out.println( pares + " valor(es) par(es)");
        System.out.println( impares + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
    }

}