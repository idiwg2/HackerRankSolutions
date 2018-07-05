import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.Charset;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        try
        {
        
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
       
       
      byte[] hash = md.digest(input.getBytes("UTF-8"));
     System.out.printf("%064x",new BigInteger(1, hash));
       
        }
       catch(UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
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