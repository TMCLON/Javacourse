
import java.util.Scanner;
public class Timetable {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("What times table would you like?" );
        int timeTable = reader.nextInt();
        for (int x = 1; x < 12; x = x + 1) {
            System.out.print(timeTable + " times " +  x + " equals " + timeTable * x);

        }


    }
}



