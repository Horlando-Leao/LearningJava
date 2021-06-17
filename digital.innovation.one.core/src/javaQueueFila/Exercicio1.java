package javaQueueFila;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio1 {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.addAll(Arrays.asList("Patricia", "Mario", "Flavio", "Pamela"));
        System.out.println("todos::" + filaBanco);

        String proximoCLienteAtendido = filaBanco.poll();
        System.out.println("atendido::" + proximoCLienteAtendido);

        System.out.println("todos::" + filaBanco);


        String proximoCLienteNaoAtendido = filaBanco.peek();
        System.out.println("em atendido::" + proximoCLienteNaoAtendido);


        //filaBanco.clear();

        String tentarAtenderCliente = filaBanco.element();
        System.out.println("tentar atender::" + tentarAtenderCliente);
        System.out.println(filaBanco);


        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }
        boolean flavioesta = filaBanco.contains("Flabio");
        System.out.println(flavioesta);

    }
}
