package mapsJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        Map<String, List> comidasFavoritasAluno = new HashMap<>();
        comidasFavoritasAluno.put("123-Horlando", Arrays.asList("Pizza", "Esfirra", "Macaxeira"));
        comidasFavoritasAluno.put("124-Carlos", Arrays.asList("Sopa", "Feijão", "Pão"));

        System.out.println(comidasFavoritasAluno);
    }
}
