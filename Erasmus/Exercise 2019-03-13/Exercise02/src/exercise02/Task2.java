
package exercise02;

import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the amount:");
        
        String amountString = sc.nextLine();
        int amount = Integer.parseInt(amountString);
        //1978
        printOutRestOfTheMoney(amount);
    }

    private static void printOutRestOfTheMoney(int amount) {
        int[] values = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int counter;
        
        for (int i = 0; i < values.length; i++) {
            counter = 0;
            
            while (amount - values[i] >= 0) {                
                counter++;
                amount -= values[i];
            }
            
            if (counter != 0) {
                System.out.println(counter + " x " + values[i]);
            }
        }
    }
    
}
