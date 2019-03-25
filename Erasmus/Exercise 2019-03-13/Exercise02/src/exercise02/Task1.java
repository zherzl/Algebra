
package exercise02;

public class Task1 {

    public static void main(String[] args) {
        for (int i = 153; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        
        System.out.println("Before program is done...");
    }

    private static boolean isArmstrong(int i) {
        int copy = i;
        int sum = 0;
        
        while (i > 0) {            
            int digit = i % 10;
            sum += Math.pow(digit, 3);
            i = i / 10;
            
        }
        
        return copy == sum;
    }
    
    
}
