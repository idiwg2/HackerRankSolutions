import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l1 = A.length();
        int l2 = B.length();
        int len = l1 + l2;
        System.out.println(len);
        int result = A.compareTo(B);
        if(result <= 0)
            System.out.println("No");
         else if(result > 0)
           System.out.println("Yes");
        
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A1 + " " + B1);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
