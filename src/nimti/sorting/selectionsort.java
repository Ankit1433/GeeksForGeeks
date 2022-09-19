package nimti.sorting;

import java.util.Arrays;
public class selectionsort {
    static void func(int arr[]){
        int min_index;
        for(int i=0;i<arr.length-1;i++){
             min_index=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }

    }

    public static void main(String[] args) {
    int arr[]={10,18,20,2,5,3};
    func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
