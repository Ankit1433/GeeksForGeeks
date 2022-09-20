package nimti.sorting;

public class intersectionofsortedarray {
    static void func(int a[],int b[]){
        int m=a.length,n=b.length;
        int i=0,j=0;
        while(i<m && j<n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.println(a[i]+" ");
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        func(a,b);
    }
}
