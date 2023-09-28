import java.util.*;

public class CountOfVowelsConsonants {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int c=0,v=0;
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if((s.substring(i,i+1)).equalsIgnoreCase("A")||(s.substring(i,i+1)).equalsIgnoreCase("E")||(s.substring(i,i+1)).equalsIgnoreCase("I")||(s.substring(i,i+1)).equalsIgnoreCase("O")||(s.substring(i,i+1)).equalsIgnoreCase("U"))
                v++;
        }
        System.out.print(v+" "+(s.length()-v));
        sc.close();
    }
}