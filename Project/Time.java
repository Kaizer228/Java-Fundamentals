package Project;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Time {
    public static void main(String[] args) {
        
        Date now = new Date();
        
        
        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
        String minutes = minuteFormat.format(now);
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fullDate = dateFormat.format(now);

        
        System.out.println("Minutes: " + minutes);
        System.out.println("Full Date: " + fullDate);
    }
}
