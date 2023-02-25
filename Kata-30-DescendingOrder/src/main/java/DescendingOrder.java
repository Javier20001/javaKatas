import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public DescendingOrder() {
    }
    
    public static int sortDesc(final int num) {
        //Your code
        String value = String.valueOf(num);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<value.length();i++){
            list.add(Integer.parseInt(String.valueOf(value.charAt(i))));
        }
        value = "";
        Collections.sort(list , Collections.reverseOrder());
        for (Integer integer : list) {
            value += String.valueOf(integer);
        }
        return Integer.parseInt(value);
    }
}
