import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<Integer>();
        if(number!=1&&number<4){
            result.add(number);
        }
        if(number>=4&&number<9){
            int mydata = number/2;
            result.add(2);
            if(mydata==4){
                int mydata2 = mydata/2;
                result.add(2);
                result.add(mydata2);
            }else{
                result.add(mydata);
            }

        }else if(number>=9){
           int mydata3 = number/3;
           result.add(3);
           if(number>=27){
               int mydata4 = mydata3/3;
               result.add(3);
               result.add(mydata4);
           }else{
               result.add(mydata3);
           }
        }
        return result;
    }
}

