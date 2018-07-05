import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
         int count=0;
        int size = scan.nextInt();
        int[] a = new int[size];
        for(int i=0 ; i < size; i++)
            a[i] = scan.nextInt();
        
        
        for(int j=0; j < size ; j++){
            int sum =0;
           for(int k =j ; k < size ; k++){
               sum = a[k]+sum;
               if(sum < 0){
                   count++;
               }
               
           }
            
         }
        System.out.println(count);
        
            
    }
}