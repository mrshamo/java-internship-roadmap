 import java.util.Scanner;
 public class DebugTask {
     public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
             System.out.println("Enter your Name: ");
             String name = input.nextLine();

                System.out.println("Enter your marks: ");
                double marks1 = input.nextDouble();
                double marks2 = input.nextDouble();
                double marks3 = input.nextDouble();
                int totalMarks = (int) (marks1 + marks2 + marks3);
                System.out.println(name + " has scored a total of " + totalMarks + " marks.");

                double percentage = (totalMarks / 300.0) * 100;
                if (percentage >= 50) {

                System.out.println(name + " has passed with a percentage of " + percentage + "%.");
                } else {
                    System.out.println(name + " has failed with a percentage of " + percentage + "%.");
                }
input.close();
            }
        }
    }
