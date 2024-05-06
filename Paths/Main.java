package Paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("Paths/file.txt");

        
        boolean exists = Files.exists(filePath);
        if (exists) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
