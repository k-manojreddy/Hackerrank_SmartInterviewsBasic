import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),t=sc.nextLong(),i=0;
        for(i=0;i<n;i++)
            if(t==sc.nextLong()){
                System.out.print(i);
                break;
            }
        if(i==n)
            System.out.print(-1);
        sc.close();
    }
}