package Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void main(String[] args) {
         
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})"; //d{4} meaning 4 digits ganon din sa iba

        
        Pattern pattern = Pattern.compile(regex);

         
        String text = "Today's date is 2024-05-19 and yesterday was 2024-05-18.";

       
        Matcher matcher = pattern.matcher(text);

        
        while (matcher.find()) {
            String year = matcher.group(1); // yung sa number meaning nyan yung unang number na ma detect nya which is 2024 second group 2 which is 5
            String month = matcher.group(2);
            String day = matcher.group(3);
            System.out.println("Found date: Year=" + year + ", Month=" + month + ", Day=" + day);
        }
    }
}

