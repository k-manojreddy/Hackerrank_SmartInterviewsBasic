import java.util.*;

public class SumOfCubes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=new Scanner(System.in).nextInt();
        System.out.println((int)Math.pow(n*(n+1)/2,2));
    }
}