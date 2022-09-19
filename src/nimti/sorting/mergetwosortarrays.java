package nimti.sorting;

import java.util.Arrays;

public class mergetwosortarrays {
    static void func(int a1[],int a2[]){
         int m= a1.length,n= a2.length;
       /*naive approach: int c[]=new int[m+n];
        for(int i=0;i<m;i++)
            c[i]=a1[i];
        for (int i=0;i<n;i++)
            c[m+i]=a2[i];
        Arrays.sort(c);
        for(int i:c)
            System.out.print(i+" "); */

        /*efficient approach*/
        int i=0,j=0;
        while (i<m && j<n){
            if(a1[i]<=a2[j]) {
                System.out.print(a1[i] + " ");
                i++;
            }
            else{
                System.out.print(a2[j] + " ");
                j++;
            }
        }
        while(i<m){
            System.out.print(a1[i]+" ");
            i++;
        }
        while (j<n){
            System.out.print(a2[i]+" ");
            j++;
        }

    }

    public static void main(String[] args) {
    int a1[]={10,15,20,40};
    int a2[]={5,6,6,10,15};
    func(a1,a2);

    }

}
