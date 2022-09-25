package nimti.sorting;

public class countinversions {
    static int mergeandcount(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for (int i=0;i<n1;i++){
            left[i]=arr[i+low];
        }
        for (int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low,res=0;
        while (i<n1 && j<n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res = res + (n1 - i);
            }
        }
            while (i<n1){
                arr[k++]=left[i++];
            }
            while (j<n2){
                arr[k++]=right[j++];
            }
        return res;
    }
    static int countinv(int arr[],int low,int high){
        int res=0;
        if(low<high) {
            int mid = low+(high-low)/2;
            res+=countinv(arr,low,mid);
            res+=countinv(arr,mid+1,high);
            res+=mergeandcount(arr,low,mid,high);
        }
        return res;
    }
    public static void main(String[] args) {
    int arr[]={2,4,1,3,5};
    int low=0,high=4;
        System.out.println(countinv(arr,low,high));
    }
}
