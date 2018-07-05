import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        try
        {
        
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.reset();
        md.update(s.getBytes());
        byte[] result = md.digest();
       BigInteger bigInt = new BigInteger(1,result);
       String hash = bigInt.toString(16);
        
        
           while(hash.length() < 32 ){
            hash = "0"+hash;
               } 
            System.out.println(hash);
        }
       
        catch(NoSuchAlgorithmException e)
        {
            System.out.println(e.getMessage());
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}