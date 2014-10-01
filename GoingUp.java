import java.util.Scanner;

public class GoingUp {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        boolean total = true;
        boolean current = true;
        
        int userNum1;
        int userNum2;
        
        System.out.print("Enter a number > ");
        userNum1 = keyboard.nextInt();
        
        while (userNum1 != -1) {
            System.out.print("Enter another number > ");
            userNum2 = keyboard.nextInt();
            
            if (userNum2 != (userNum1+1)) {
                total = false;
            }
            else {
                total = true;
            }
            userNum1 = userNum2;
        }
        
        if (total) {
            System.out.println("YES!");
        }
        else if (!total) {
            System.out.println("NO!");
        }
    }
}