import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+(n*i));
    }
}