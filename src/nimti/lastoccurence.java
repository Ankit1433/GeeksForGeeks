package nimti;

public class lastoccurence {
    static int func2(int arr[],int x){
        int low=0,high= arr.length-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(x>arr[mid]){
                low=mid+1;
            } else if (x<arr[mid]) {
                high=mid-1;

            }
            else{
                if(mid==arr.length-1|| arr[mid+1]!=arr[mid]){

                    return mid;
                }
                else{
                    low=mid+1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={10,20,20,20,30,30};
        int x=20;
        System.out.println(func2(arr,x));

    }
}
