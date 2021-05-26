package digital.innovation.one.utils.internal;

public class DiviHelper implements Operacao {

    @Override
    public int execute(int a, int b){
        final int i = a / b;
        return i;
    }
}
