import java.util.*;

public class BinarySearch {
         static int Bsearch(int a[],int l,int h,int x){
             if(l<=h){
                 int mid=(l+h)/2;
                 if(a[mid]==x)
                     return mid;
                 else if(x<a[mid])
                     return Bsearch(a,l,mid-1,x);
                 else
                     return Bsearch(a,mid+1,h,x);
             }
             return -1;
         }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(Bsearch(a,0,a.length-1,t)==-1)
            System.out.print("false");
        else
            System.out.print("true");
        sc.close();
    }
}