import java.util.Scanner;

public class Bank{
    Scanner myScanner = new Scanner(System.in);
    boolean MenyOn = true;
    Register myRegister = new Register();

    public void mainMenu(){

        while(MenyOn){
        
            System.out.println("\n" + "Välkommen till menyn!");
            System.out.println("1. Skapa konto");
            System.out.println("2. Administrera konto");
            System.out.println("3. Lista på alla konton");
            System.out.println("4. Avsluta");
            System.out.print("Ditt val: ");
            int userChoice = myScanner.nextInt();

            switch(userChoice){
                case 1:
                    myRegister.addAccount();
                 break;
                case 2:
                    myRegister.accountMenu();
                 break;
                case 3:
                    myRegister.listAllAcounts();
                 break;
                case 4:
                    System.out.println("Avslutar program!");
                    MenyOn = false; 
                 break;
            }
        }
    }
}