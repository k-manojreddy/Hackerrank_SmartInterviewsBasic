
import java.util.*;


public class MatrixColumnSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    for(int i=0;i<c;i++){
        int s=0;
        for(int j=0;j<r;j++){
            s+=a[j][i];
        }
        System.out.println(s);
    }
    sc.close();
    }
}