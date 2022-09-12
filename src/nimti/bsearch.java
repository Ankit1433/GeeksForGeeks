package nimti;

public class bsearch {
    static int fun2(int arr[],int low,int high,int x){
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]==x){
            return mid;
        }
        else if (arr[mid]>x) {
            return fun2(arr,low,mid-1,x);
        }
        else {
            return fun2(arr, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int x=40;
        int low=0,high= arr.length-1;
        System.out.println(fun2(arr,low,high,x));

    }
}
