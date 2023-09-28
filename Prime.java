import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n<=1){
            System.out.print("No");
            return;
        }
        if(n==2||n==3||n==5){
            System.out.print("Yes"); return;
        }
        if(n%2==0||n%3==0||n%5==0){
            System.out.print("No"); return;
        }
        long k=n/6;
        if((n%((6*k)+1)==0)||(n%((6*k)+5)==0)){
            System.out.print("Yes"); return;
        }
    }
}
/*This is not exact Logic */