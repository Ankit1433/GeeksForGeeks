package nimti.sorting;

public class lomutopartionqs {
    static int func(int arr[],int low,int high){
      int i=low-1,pivot=arr[high];;
      for(int j=low;j<=high-1;j++){
          if(arr[j]<pivot){
              i++;
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
      }
      int temp2=arr[high];
      arr[high]=arr[i+1];
      arr[i+1]=temp2;
        return i+1;
    }

    public static void main(String[] args) {
    int arr[]={10,80,30,90,40,50,70};
    int low=0;
    int high=arr.length-1;
        System.out.println(func(arr,low,high));
        for(int i:arr)
            System.out.print(i+" ");
    }
}
