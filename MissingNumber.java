import java.util.*;


public class MissingNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a[]=new int[99];
        for(int i=0;i<99;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<99;i++){
            if(a[i]!=(i+1)){
                System.out.print((i+1)); break;}
        }
        sc.close();
    }
}