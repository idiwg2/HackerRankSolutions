import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        char[] ch = A.toCharArray();
        boolean isPalindrome = true;
        for(int i=0;i< ch.length;i++)
        {
            if( ch[ch.length-1-i] != A.charAt(i) )
            {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? "Yes" : "No");
        sc.close();
}
}
