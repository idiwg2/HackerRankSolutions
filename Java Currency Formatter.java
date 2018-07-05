import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        
         Locale INDIA = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
