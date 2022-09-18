package nimti.sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arra {
    public static void main(String[] args) {
        Integer arr[]={13,556,878,232};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(12);
        a1.add(76);
        a1.add(7665);
        a1.add(7);
        Collections.sort(a1);
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);
    }
}
