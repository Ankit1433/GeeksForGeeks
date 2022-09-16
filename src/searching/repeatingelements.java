package searching;

public class repeatingelements {
    static int findrepeating(int[] arr, int n){
        int slow=arr[0]+1,fast=arr[0]+1;
        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        }
        while(slow!=fast);
        slow=arr[0]+1;
        while (slow!=fast){
            slow=arr[slow]+1;
            fast=arr[fast]+1;
        }
        return slow-1;
    }

    public static void main(String[] args) {
    int[] arr ={0,1,2,3,5,5,4,5};
    int n=arr.length;
        System.out.println(findrepeating(arr,n));
    }
}
