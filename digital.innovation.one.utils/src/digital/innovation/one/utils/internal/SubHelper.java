package digital.innovation.one.utils.internal;

public class SubHelper implements Operacao {

    @Override
    public int execute(int a, int b){
        final int i = a - b;
        return i;
    }
}
