package nimti;

public class firstoccurence {
    static int firoc(int[]arr,int x){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(x>arr[mid]){
                low=mid+1;
            }
            else if (x<arr[mid]){
                high=mid-1;
            }
            else if(arr[mid]==0||arr[mid-1]!=arr[mid]){
                    return mid;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={2,3,6,6,7,8,8,8,99};
        int x=8;
        System.out.println(firoc(arr,x));

    }
}
