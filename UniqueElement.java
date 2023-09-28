import java.io.*;
import java.util.*;

public class UniqueElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                    t++;
            }
            b[i]=t;
        }
        for(int i=0;i<n;i++)
            if(b[i]==1)
                System.out.print(a[i]+" ");
        
    }
}