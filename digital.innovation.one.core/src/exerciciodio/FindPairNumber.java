package exerciciodio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class FindPairNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        findPair(a);
    }
    public static void findPair(int numberInt){

        ArrayList arrayList = new ArrayList();
        int counter = numberInt;
        for (int i = 0 ; i <= counter ; i++) {
            if (numberInt%2 == 0 && numberInt != 0) {
                arrayList.add(numberInt);
            }
            numberInt = numberInt-1;
        }
        Collections.reverse(arrayList);
        for (int i = 0 ; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}