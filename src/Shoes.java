import java.util.Scanner;
public class Shoes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What colour are your shoes?.");
        String response = reader.nextLine();
        if (response.equals("black") || response.equals("brown")) {
            System.out.println(" Yes, that is correct.");
        } else if (response.equals("red")) {
            System.out.println(" No, that is incorrect. My shoes are not red!");
        } else {
            System.out.println(" I don't know. I am too busy looking at your handbag!.");
        }
    }
}



