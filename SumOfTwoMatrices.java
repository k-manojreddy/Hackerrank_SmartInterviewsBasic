
import java.util.*;

public class  SumOfTwoMatrices {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][]=new int[r][c],b[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j]=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j]+b[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}