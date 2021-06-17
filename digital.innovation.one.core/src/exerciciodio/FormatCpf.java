package exerciciodio;
import java.util.Scanner;
import java.util.Locale;

public class FormatCpf {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        String cpf = sc.nextLine();
        System.out.println(formatStringCpfPerSegment(cpf));

        sc.close();
    }

    public static String formatStringCpfPerSegment(String cpf){
        String pointCpf = splitDotCpf(cpf);
        String traceCpf = splitTraceCpf(cpf);
        return pointCpf + traceCpf;
    }

    public static String splitDotCpf(String cpf){
        String[] output = cpf.split("\\.");
        String cpfOut = output[0]+"\n"+output[1]+"\n"+output[2].substring(0,3)+"\n";
        return cpfOut;
    }

    public static String splitTraceCpf(String cpf){
        String[] output = cpf.split("-");
        String cpfOut = output[1];
        return cpfOut;
    }
}
