package nimti.sorting;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class minimumdifference {
    static int func(int arr[]){
        int res= Integer.MAX_VALUE;
        Arrays.sort(arr);
       for (int i=1;i<arr.length;i++){
           res=Math.min(res,arr[i]-arr[i-1]);
       }
        return res  ;

    }

    public static void main(String[] args) {
        int arr[]={10,8,1,4};
        System.out.println(func(arr));
    }
}
