package nimti;

public class kadane {
    static int algo(int arr[]){
        int res=arr[0];
        int maxending=arr[0];
        for(int i=1;i<4;i++){
            maxending=Math.max(arr[i],maxending+arr[i]);
        }
        res=Math.max(res,maxending);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        System.out.println(algo(arr));
    }
}
