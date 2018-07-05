import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        BigInteger firstNumber = scan.nextBigInteger();
        BigInteger secondNumber = scan.nextBigInteger();
        
        BigInteger additionResult = firstNumber.add(secondNumber);
        System.out.println(additionResult);
        
        BigInteger mulResult = firstNumber.multiply(secondNumber);
        System.out.println(mulResult);
        
    }
}