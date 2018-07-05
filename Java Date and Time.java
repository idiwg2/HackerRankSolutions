
public class Solution {
    public static String getDay(String day, String month, String year)  {
        /*
        * Write your code here.
        */
        java.time.LocalDate localDate = java.time.LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),                 Integer.parseInt(day));
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
        
        
    }