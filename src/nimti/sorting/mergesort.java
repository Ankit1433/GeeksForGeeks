package nimti.sorting;

public class mergesort {
    static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i+low];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=low;
        while(i<n1 &&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }


    }
    static void mergesort(int arr[],int low,int high) {
        if(high>low){
            int mid = low + (high - low) / 2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
      int arr[]={10,5,30,15,7};
      int low=0,high=4;
      mergesort(arr,low,high);
      for(int i:arr)
          System.out.print(i+" ");

    }
}
