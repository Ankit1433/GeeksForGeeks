ublic class twopointers {
    static boolean func(int arr[],int x){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            } else if (arr[i]+arr[j]>x) {
                j=j-1;
            }
            else {
                i=i+1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int arr[]={2,5,8,16,24,30};
        int x=40;
        System.out.println(func(arr,x));

    }

}
