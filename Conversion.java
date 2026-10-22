//Exercise 1: int → double (Widening)
import java.util.Scanner;
public class Conversion {

    public static void main(String[]args){
       try( Scanner input = new Scanner(System.in)){
        System.out.println("Enter the marks you want to convert int → double : ");
        int marks = input.nextInt();
        double result = marks ;
        System.out.println("The converted value is: " + result);



        //Exercise 2: double → int (Narrowing)
        System.out.println("Enter the marks you want to convert double → int : ");
        double marks1 = input.nextDouble();
        int result1 = (int)marks1 ;
        System.out.println("The converted value is: " + result1);




        //Exercise 3: char → int
        System.out.println("Enter the character you want to convert char → int : ");
        char ch = input.next().charAt(0);
        int result2 = (int)ch;
        System.out.println("The converted value is: " + result2);






    //Exercise 4: String → int
    System.out.println("Enter the age you want to convert String → int : ");
        String agetext = input.next();
        int result3 = Integer.parseInt(agetext);
        System.out.println("The converted value is: " + result3);





        //Exercise 5: String → double
        System.out.println("Enter the salary you want to convert String → double : ");
        String salarytext = input.next();
        double result4 = Double.parseDouble(salarytext);
        System.out.println("The converted value is: " + result4);
    }
}
}