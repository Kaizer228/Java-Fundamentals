package ENUM;

import java.util.ArrayList;
import java.util.Scanner;

 

public class Main {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();  

      
        ArrayList<String> prelimList = new ArrayList<>();
        ArrayList<String> midtermList = new ArrayList<>();
        ArrayList<String> prefinalList = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();

        System.out.println("Enter semester:\n [1] PRELIM \n [2] MIDTERM  \n [3] PREFINALS \n [4] FINALS");
        int quarter = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter grades separated by space to compute average:");
        String gradesInput = sc.nextLine();
        String[] gradesArray = gradesInput.split(","); 

        for (String grade : gradesArray) {
            switch (quarter) {
                case 1:
                    prelimList.add(grade);
                    break;
                case 2:
                    midtermList.add(grade);
                    break;
                case 3:
                    prefinalList.add(grade);
                    break;
                case 4:
                    finalList.add(grade);
                    break;
                default:
                    System.out.println("Invalid input.");
                    return;  
            }
        }

         
        int average = 0;
        switch (quarter) {
            case 1:
                average = main.calculateAverage(prelimList);
                break;
            case 2:
                average = main.calculateAverage(midtermList);
                break;
            case 3:
                average = main.calculateAverage(prefinalList);
                break;
            case 4:
                average = main.calculateAverage(finalList);
                break;
            default:
                System.out.println("Invalid input.");
                return;  
        }

        System.out.println("Your average is: " + average);
    }

    public int calculateAverage(ArrayList<String> gradesList) {
        int sum = 0;
        for (String grade : gradesList) {
            sum += Double.parseDouble(grade);
        }
        if (gradesList.size() > 0) {  
            return sum / gradesList.size();
        } else {
            return 0;
        }
    }
}
