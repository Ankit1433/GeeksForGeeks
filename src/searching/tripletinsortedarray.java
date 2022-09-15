package searching;

public class tripletinsortedarray {
    static boolean ispair(int arr[],int x,int si){
         int i=si,j=arr.length-1;
         while(i<j){
             if(arr[i]+arr[j]==x){
                 return true;
             }
             else if (arr[i]+arr[j]<x) {
                 i++;
             }
             else{
                 i++;
             }
         }
        return false;
    }
    static boolean tripletpair(int arr[],int x){
        for(int i=0;i<arr.length-2;i++){

            if(ispair(arr,x-arr[i],i+1)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[]={2,3,5,6,15};
        int x=20;
        System.out.println(tripletpair(arr,x));
    }
}
