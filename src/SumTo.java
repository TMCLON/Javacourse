import java.util.Scanner;
public class SumTo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to sum to ");
        int answer = reader.nextInt();
        int sumTo = 0;
        int counter = 1;
        while (counter <= answer) {
            if (counter <= answer)
                System.out.println(counter + " ");
            sumTo = sumTo + counter;
            counter++;
        }
        {
            System.out.println(" = " + sumTo);
        }
    }
}


