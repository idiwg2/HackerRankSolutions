import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
       
        
        BitSet B1 = new BitSet(size);
        BitSet B2 = new BitSet(size);
       // B1.set(0);
       // B2.set(0);
        
        int M = scan.nextInt();
        for(int i=0 ; i < M ; i++)
        {
            String s = scan.next();
            int a =scan.nextInt();
            int b =scan.nextInt();
            if(s.equals("AND"))
            {
                
                if(a == 1)
                    B1.and(B2);
                else
                   B2.and(B1);
            }
            
            else if(s.equals("OR"))
            {
               
                if(a == 1)
                    B1.or(B2);
                else
                   B2.or(B1);
            }
            
            else if(s.equals("XOR"))
            {
              
                if(a == 1)
                    B1.xor(B2);
                else
                   B2.xor(B1);
            }
            
            else if(s.equals("FLIP"))
            {
            
             if(a == 1)
                 B1.flip(b);
             else
                 B2.flip(b);
            }
            else 
            {
               
                if(a == 1)
                    B1.set(b);
                else
                 B2.set(b);
            }
            
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close();
    }
}