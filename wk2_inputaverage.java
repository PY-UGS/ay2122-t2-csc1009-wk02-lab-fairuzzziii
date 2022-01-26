package Week2;
import java.util.Scanner;

public class wk2_inputaverage {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        float[] vars = new float[3];

        System.out.print("Enter three numbers: ");
        for(int i = 0; i < vars.length; i++){
        vars[i] = myObj.nextFloat();
        } 

        float total = 0;
        for(int i = 0; i < vars.length; i++){
        total += vars[i];
        }
        float average = total/vars.length;

        System.out.print("The average of ");
        for(int i = 0; i<vars.length; i++){
            System.out.print(vars[i] + " " );
        }
        System.out.print("is " + average);
    }
}