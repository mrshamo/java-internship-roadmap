
import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
       try( Scanner input = new Scanner(System.in)){
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your City name: ");
         String city = input.next();

        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.println("User Profile DATA:");
        System.out.println("Your Name is: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("Your City is: " + city);
        System.out.println("Your GPA is: " + gpa);
        input.close();
    }
}
}