import java.util.*;


public class ASparseMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),z=0;
        for(int i=0;i<(r*c);i++)
            if(sc.nextInt()==0)
                z++;
        System.out.println((z>((r*c)/2))?"Yes":"No");
       sc.close(); 
    }
}