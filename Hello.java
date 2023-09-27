import java.io.Console;
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){

        int rightAnswer = 10;
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