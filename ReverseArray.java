
import java.util.*;

public class ReverseArray {
     static void reverse(String s[],int n){
         if(n<=0)
         System.out.print(s[0]);
         else{
             System.out.print(s[n]+" ");
             reverse(s,n-1);
         }
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
            s[i]=sc.next();
        reverse(s,s.length-1);
        sc.close();
    }
}