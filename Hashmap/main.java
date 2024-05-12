import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
       
        HashMap<String, Integer> Grades = new HashMap<>();

       
        Grades.put("Math", 90);
        Grades.put("English", 90);
        Grades.put("Contemp", 90);

       
        for (Map.Entry<String, Integer> entry : Grades.entrySet()) {
            String subject = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(subject + ": " + score);
        }
    }
}
