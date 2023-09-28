import java.util.*;

public class No.OfMultiples {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),t=0;
        t=(long)(n/3)+(long)(n/5)-(long)(n/15);
        System.out.print(t);
    }
}