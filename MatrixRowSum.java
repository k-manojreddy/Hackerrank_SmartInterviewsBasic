
import java.util.*;


public class MatrixRowSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        for(int i=1;i<=r;i++){
            int s=0;
            for(int j=1;j<=c;j++){
                s+=sc.nextInt();
            }
            System.out.println(s);
        }
        sc.close();
    }
}