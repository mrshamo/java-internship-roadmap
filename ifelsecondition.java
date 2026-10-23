import java.util.Scanner;

public class ifelsecondition {
    public static void main(String[] args) {
       try(Scanner input = new Scanner(System.in)) {
        System.out.println("Enter your Marks: ");
        double marks = input.nextDouble();
        {

        if (marks>=90){
            System.out.println("you get Grade A");

        }
        else if (marks>=80){
            System.out.println("you get Grade B");
        }
        else if (marks>=70){
            System.out.println("you get Grade C");
        }
        else if (marks>=60){
            System.out.println("you get Grade D");
        }
        else if (marks>=50){
            System.out.println("you get Grade E");
        }
        else {
            System.out.println("you are fail");
        }
        input.close();
        }
}
}
}