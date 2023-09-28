import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=new Scanner(System.in).nextInt(),f=0,g=1;
        if(1<=n&&n<=20)
        for(int i=1;i<=n;i++){
            f=f+g;
            g=f-g;
        }
        System.out.print(f);
    }
}