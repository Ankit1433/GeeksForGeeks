package nimti.sorting;

public class qsusinglp {
    static int partition(int arr[],int low,int high){
        int i=low-1,pivot=arr[high];;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp2;
        return i+1;
    }
    static void qsort(int arr[],int low,int high){
      if (low<high){
          int p=partition(arr,low,high);
          qsort(arr,low,p-1);
          qsort(arr,p+1,high);
      }
    }

    public static void main(String[] args) {
    int arr[]={8,4,7,9,3,20,5};
    int low=0;
    int high=arr.length-1;
    int pivot=arr[high];
        qsort(arr,low,high);
        for (int x:arr)
            System.out.print(x+" ");
    }
}
