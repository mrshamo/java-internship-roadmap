import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + name + ": Welcome to the Java Internship Roadmap!");
        System.out.println("You are " + age + " years old & eligible for the Java Internship Roadmap.");
        input.close();
    }
}
