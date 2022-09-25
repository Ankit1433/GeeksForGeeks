package nimti.sorting;

public class qsusinghp {
    static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low-1;
        int j=high+1;
        while (true){
            do{
                i++;

            }while (arr[i]<pivot);
            do{
                j--;

            }while (arr[j]>pivot);
            if(i>=j)
                return j;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    static void qs(int arr[],int low,int high){

        if(low<high){

            int p=partition(arr,low,high);
            qs(arr,low,p);
            qs(arr,p+1,high);
        }


    }

    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        int low=0;
        int high= arr.length-1;
        qs(arr,low,high);
        for(int i:arr)
            System.out.print(i+" ");


    }
}
