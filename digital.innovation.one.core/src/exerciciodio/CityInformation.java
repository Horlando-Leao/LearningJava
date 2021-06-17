package exerciciodio;

import java.util.Hashtable;
import java.util.Scanner;

public class CityInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String codeCity = sc.nextLine();
        System.out.println(getCity(codeCity));
    }

    public static String getCity(String codeCity){
        Hashtable<String, String> listCities = new Hashtable<String, String>();
        listCities.put("61", "Brasilia");
        listCities.put("71", "Salvador");
        listCities.put("11", "Sao Paulo");
        listCities.put("21", "Rio de Janeiro");
        listCities.put("32", "Juiz de Fora");
        listCities.put("19", "Campinas");
        listCities.put("27", "Vitoria");
        listCities.put("31", "Belo Horizonte");

        //String isExists =
        if ( listCities.get(codeCity) != null){
            return listCities.get(codeCity);
        }else{
            return "DDD nao cadastrado";
        }

    }
}
