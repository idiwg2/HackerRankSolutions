import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> [] alist = new List[N];
        for(int i= 0 ; i < N ; i++)
        {
            List<Integer> l = new ArrayList<>();
            int d =scan.nextInt();
            for(int j=0; j < d ; j++)
                l.add(scan.nextInt());
            
           alist[i] =l;
            
        }
        
        int q = scan.nextInt();
        for(int k=0 ; k < q ; k++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
           
            
               if(y <= alist[x-1].size())
                   System.out.println(alist[x-1].get(y-1));
               
            
              else
                System.out.println("ERROR!");
            
            
            
            
        }
        
        scan.close();
    }
}