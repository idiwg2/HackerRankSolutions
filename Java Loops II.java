import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = a+b;
            
            for(int j=1 ; j < n ;j++)
            {
                arr[j] = arr[j-1]+((int)Math.pow(2,j))*b;
                
            }
            
            for(int k=0 ; k < arr.length ; k++)
            {
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
