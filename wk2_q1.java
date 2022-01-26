package Week2;
import java.util.Scanner;

public class wk2_q1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = input.nextDouble();

        //part 2 of question 1
        final double Pi =  3.14159;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radius = myObj.nextFloat();
        double area = radius * radius * Pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
