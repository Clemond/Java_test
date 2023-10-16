import java.io.Console;
import java.lang.ref.Cleaner;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        Methods methods = new Methods();

        System.out.println("Hej! Skriv in ett tal: ");
         int firstNumber = myScanner.nextInt();
        System.out.println("Skriv in ett till tal: ");
         int secondNumber = myScanner.nextInt();

         methods.multiplyNumber(firstNumber, secondNumber);



        

    }
}