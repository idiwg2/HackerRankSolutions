import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         int count = 0;
         String pattern = in.nextLine();
             //Write your code
          try{
              Pattern pattern1 = Pattern.compile(pattern);
          }
          catch(Exception e)
          {
              count++;
          }
          
          if(count!=0)
              System.out.println("Invalid");
          else
              System.out.println("Valid");
      }
   }
}
