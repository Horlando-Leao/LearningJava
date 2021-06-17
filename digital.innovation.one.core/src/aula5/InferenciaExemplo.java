package aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {


        connectAndPrint();


    }

    private static void connectAndPrint() throws IOException {
        var url = new URL("https://upbeat-spence-f2ffdb.netlify.app/");
        var urlConnection = url.openConnection();
        var bufferReader = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()));
        System.out.println(bufferReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }
}
