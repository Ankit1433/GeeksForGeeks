package nimti.sorting;

public class kthminimumelement {
    static int partition(int arr[],int l,int h){
       int pivot=arr[h];
        int i=l-1;
        for (int j=l;j<=h;j++){
            if (arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp2;
        return i+1;
    }
    static int minimum(int arr[],int k){
        int l=0,h=arr.length-1;
        while (l<=h){
            int p=partition(arr,l,h);
            if(p==k-1)
                return p;
            else if (p<k-1) {
                l=p+1;
            }
            else{
                h=p-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,4,5,8,11,6,26};
        int k=5;
        int index=minimum(arr,k);
        System.out.println(arr[index]);
    }
}
