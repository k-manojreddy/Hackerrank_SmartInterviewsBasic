import java.util.*;

public class InvertedPyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                if((i==1)||(j==1))
                    System.out.print("* ");
                else if(j==n+1-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}