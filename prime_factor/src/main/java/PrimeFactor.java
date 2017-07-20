import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<Integer>();
        if(number!=1&&number<4){
            result.add(number);
        }
        if(number>=4){
            int mydata = number/2;
            result.add(2);
            result.add(mydata);
        }
        return result;
    }

}
