import java.util.Scanner;
public class Tempchecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the temperature today? In celcius? ");
        int number = reader.nextInt();
        //even = , odd = , negative =
        if (number < 1) {
            //if statement is true, execute this code
            System.out.println("The number is negative");
        } else if (number % 2 == 0) {
            //if statement is true, execute this code
            System.out.println("The number is even");
        } else {
            //if statement is true, execute this code
            System.out.println("The number is odd");
        }
    }
    }


