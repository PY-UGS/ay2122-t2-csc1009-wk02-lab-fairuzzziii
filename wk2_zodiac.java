package Week2;
import java.util.Scanner;

public class wk2_zodiac {
    public static void main(String [] args){
    Scanner myInput = new Scanner(System.in);

    String[] zodiacs= {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
    
    System.out.print("Enter a year: ");
    int year = myInput.nextInt();

    String zodiacSign = zodiacs[year%12];

    System.out.print(zodiacSign);
    }
    
}
