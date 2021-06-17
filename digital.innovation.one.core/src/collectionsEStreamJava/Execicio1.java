package collectionsEStreamJava;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Execicio1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.addAll(Arrays.asList("Juliana", "Pedro", "Carlos", "Larrisa", "João"));

        PrintAllNomes(nomes, "=>");

        int posicaoCarlos = nomes.indexOf("Carlos");
        nomes.set(posicaoCarlos, "Roberto");

        PrintAllNomes(nomes, "==>");

        System.out.println("===>" + nomes.get(1));
        System.out.println("===>" + nomes.get(4));

        nomes.remove("João");
        PrintAllNomes(nomes, "=:>");

        int quantidadeNomes = nomes.size();
        System.out.println("quant. itens:: " + quantidadeNomes);

        boolean existeJuliana = nomes.contains("Juliana");
        System.out.println("Juliana existe? => " + existeJuliana);

        List<String> nomes2 = new ArrayList<>();
        nomes2.addAll(Arrays.asList("Ismael", "Rodrigo"));

        nomes.addAll(nomes2);

        Collections.sort(nomes);
        PrintAllNomes(nomes, "::>");


        System.out.println("lista de nomes está vazia? => " + nomes.isEmpty());
        nomes.clear();
        System.out.println("lista de nomes está vazia? ==> " + nomes.isEmpty());

    }


    public static void PrintAllNomes(List<String> nomes, String simbolo){
        for (String nome: nomes) {
            System.out.println(simbolo + nome);
        }
    }
}
