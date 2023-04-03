import java.util.Scanner;
public class Storeopen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the store open? Y or N");
        String response = reader.nextLine();
        if (!response.equals("Y") || response.equals("N")) ;
        {
            System.out.println(" ok, I'll come back another time.");
        }
        elseif (response.equals("y"));
        {
            System.out.println("Wrong answer. Only Y or N please");
        }

    }

    private static void elseif(boolean equals) {
    }
}





