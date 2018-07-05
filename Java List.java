import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = scan.nextInt();
        for(int i=0;i < N ; i++)
        {
            int n = scan.nextInt();
            list.add(i,n);
        }
        
        int Q =scan.nextInt();
       
        for(int j=0 ; j < Q ; j++)
        {
            String s = scan.next();
            if(s.equals("Insert"))
            {
                int x =scan.nextInt();
                int y = scan.nextInt();
                
                list.add(x,y);
            }
            
            else if(s.equals("Delete"))
            {
                int r = scan.nextInt();
                list.remove(r);
            }
        }
        scan.close();
        for(int k =0 ; k < list.size();k++)
            System.out.print(list.get(k)+" ");
        
    }
}
