package nimti.sorting;

public class naivepartitionqs {
    static void func(int arr[],int low,int high,int p){
        int temp[]=new int[high-low+1];
        int index=0;
        for(int i=low;i<=high;i++){
        if(arr[i]<=arr[p]){
            temp[index++]=arr[i];
        }}
        for(int i=low;i<=high;i++){
        if(arr[i]>arr[p]) {
            temp[index++]=arr[i];
        }
        }
        for (int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }


    }

    public static void main(String[] args) {
        int arr[]={5,13,6,9,12,11,8};
        int p=6;
        int low=0,high=6;
        func(arr,low,high,p);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
