package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int productCode = 0;
        ArrayList<Integer> codeList = new ArrayList<>();
        ArrayList<String> productList = new ArrayList<>();
        ArrayList<String> priceList = new ArrayList<>();

        while (true) {
            System.out.println("Product name:");
            String productName = sc.nextLine();
            productList.add(productName);

            System.out.println("Product price:");
            String productPrice = sc.nextLine();
            priceList.add(productPrice);
            
            
            sc.nextLine();

            productCode++;
            codeList.add(productCode);

            System.out.println("You want to quit? Yes[1] No[2]");
            int choice = sc.nextInt();
            
            
            sc.nextLine();

            if (choice == 1) {
                break;
            }
        }

        while (true) {
            try {
                System.out.println("Search product using code:");
                int inputCode = sc.nextInt();
                sc.nextLine();

                int index = inputCode - 1;
                if (index >= 0 && index < codeList.size()) {
                    System.out.println("Code: " + codeList.get(index));
                    System.out.println("Product: " + productList.get(index));
                    System.out.println("Price: " + priceList.get(index));
                } else {
                    System.out.println("Code does not exist.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid code.");
                sc.nextLine();  
            }
        }
    }
}
