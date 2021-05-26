package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DiviHelper;
import digital.innovation.one.utils.internal.MultHelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private DiviHelper diviHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;


    public Calculadora(){
        diviHelper =  new DiviHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }


    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int div(int a, int b){
        return diviHelper.execute(a, b);
    }

    public int mul(int a, int b){
        return multHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }
}
