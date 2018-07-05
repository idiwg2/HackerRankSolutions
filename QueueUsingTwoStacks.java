import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private Stack<Integer> stack1 = new Stack<Integer> ();
    private Stack<Integer> stack2 = new Stack<Integer> ();
    
    public void enqueue(int x)
    {
        stack1.push(x);
    }
    
    public void dequeue()
    {
        if(stack2.isEmpty())
        {
        while(!stack1.isEmpty())
        {
            int temp = stack1.pop();
            stack2.push(temp);
        }
        }
           stack2.pop();
    }
    
    public int peek(){
        
        if(stack2.isEmpty())
        {
        while(!stack1.isEmpty())
        {
            int temp = stack1.pop();
            stack2.push(temp);
        }
        }
        return stack2.peek();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfQueries = scan.nextInt();
        Solution s = new Solution();
        for(int i= 0; i <numberOfQueries;i++ )
        {
            int type = scan.nextInt();
            if(type==1)
                s.enqueue(scan.nextInt());
            else if(type==2)
                s.dequeue();
                
            else if(type ==3)
                System.out.println(s.peek());
        }
        
    }
}