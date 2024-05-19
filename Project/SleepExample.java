package Project;

public class SleepExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message " + i);
            
            try {
                // every loop nag hihintay si loop ng 1 second bago ma loop
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception if the sleep is interrupted
                System.err.println("Thread was interrupted while sleeping.");
            }
        }
        
        System.out.println("Loop finished.");
    }
}
