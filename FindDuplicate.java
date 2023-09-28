
import java.util.*;

public class FindDuplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            for(int j=0;j<i;j++)
                if(a[j]==a[i])
                    System.out.print(a[j]+" ");
        }
        sc.close();
    }
}