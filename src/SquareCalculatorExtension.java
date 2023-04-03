import java.util.Scanner;
class Squarecalculator{
    public static void main(String[] args) {
        //this program will calculate perimeter and area of square

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter new widths and heights of a rectangle to recalculate the area and perimeter");
        System.out.println("Width = ");
        double width = reader.nextDouble();

        System.out.println("Height = ");
        double height =reader.nextDouble();


        //calculate perimeter
        double perimeter = (width + height) * 2;
        //calculate area
        double area = (width * height);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}