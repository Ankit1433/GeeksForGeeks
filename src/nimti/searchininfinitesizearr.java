package nimti;

public class searchininfinitesizearr {
    static int bins(int arr[],int x,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(x>arr[mid]){
            return bins(arr,x,mid+1,high);
        }
        else{
            return bins(arr,x,low,mid-1);
        }

    }
    static int func5(int arr[],int x){
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(arr[i]<x) {
            i = i * 2;
            if (arr[i] == x) {
                return x;
            }
        }
            return bins(arr,x,(i/2)+1,i-1);
    }

    public static void main(String[] args) {
    int arr[]={1,20,40,50,70,100,125,175,200,250,275,300};

    int x=125;
        System.out.println(func5(arr,x));
    }
}
