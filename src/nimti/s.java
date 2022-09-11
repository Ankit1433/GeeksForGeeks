package nimti;
import java.util.*;
public class s {
    public static void main(String[] args) {
        int arr[]={4,0,2,1,3};
        int arr1[]=new int[5];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i< arr.length;i++){
            arr[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    }