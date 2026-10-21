import java.util.Scanner;
public class Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
        System.out.println("Enter the number you want to check: ");
        int num = input.nextInt();
        
        int R = num % 2;
        if (R == 0) {
            System.out.println(num + "\t" + "The number is even.");
        } else {
            System.out.println(num + "\t" + " The number is odd.");
        }
    }
        input.close();
    }
}