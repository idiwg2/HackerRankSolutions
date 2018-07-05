import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

      

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            
              arr[i] = scan.nextInt();
        }
        
        for(int i= arr.length-1 ; i >=0 ; i--)
            System.out.print(arr[i]+" ");
        
        scan.close();
    }
}
