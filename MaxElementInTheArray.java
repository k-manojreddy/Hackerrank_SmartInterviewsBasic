
import java.util.*;


public class MaxElementInTheArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a[]=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        /*Arrays.sort(a);
        System.out.print(a[a.length-1]);*/
        int m=a[0];
        for(int i=0;i<a.length;i++)
        if(m<=a[i])
        m=a[i];
        System.out.print(m);
        sc.close();
    }
}