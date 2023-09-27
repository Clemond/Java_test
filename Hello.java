import java.io.Console;
import java.util.Scanner;
import java.util.Random;

public class Hello{
    public static void main(String[] args){

        //Siffer genererare
        Random sifferGenererare = new Random();
        int rightAnswer = 1+sifferGenererare.nextInt(100);
        //Scanner för vad användaren skriver in med tangentbordet
        Scanner myScanner = new Scanner(System.in);

        while(true){
            System.out.println("Hej! Vänligen skriv en siffra! ");
            int userGuessedNumber = myScanner.nextInt();
            if(userGuessedNumber > rightAnswer){
                System.out.println("Du har gissat på " + userGuessedNumber + ". Talet är för högt, gissa lägre!");
            }
            else if(userGuessedNumber < rightAnswer){
                System.out.println("Du har gissat på " + userGuessedNumber + ". För lågt, gissa högre");
            }
            else{
                System.out.println("Du har gissat rätt! Svaret var " + userGuessedNumber);
                break;
            }
        }
    }
}