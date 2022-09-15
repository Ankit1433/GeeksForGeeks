package nimti;

public class squareroot {
    static int func3(int x){
        int low=1,high=x,ans=0;

    while(low<=high){
        int mid=(low+high)/2;
        int msq=mid*mid;
        if(msq==x){
            return mid;
        }
        else if (msq<x){
            low=mid+1;
            ans=mid;
        }
        else{
            high=mid-1;
        }

    }

        return ans;
    }

    public static void main(String[] args) {
    int x=521;
        System.out.println(func3(x));
    }
}
