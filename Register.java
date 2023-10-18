import java.util.ArrayList;
import java.util.Scanner;

public class Register {
        ArrayList<Account> listOfAccounts = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);

    public void addAccount(){
        boolean registrera = true;

        System.out.println("Skriv in kontonummer: ");
        int userInputAccountNumber = myScanner.nextInt();

        if(listOfAccounts.size() == 0){
            listOfAccounts.add(new Account(userInputAccountNumber));
            System.out.println("Kontot är registrerat (från första if)");
            registrera = false;
        }
        else{
            for(int i = 0; i < listOfAccounts.size(); i++){
                if(userInputAccountNumber == listOfAccounts.get(i).getAccountNumber()){
                        System.out.println("kontot finns redan!");
                        System.out.println("Vänligen testa ett annat kontonummer!");
                        registrera = false;
                        break;
                }
            }
        while(registrera){    
        listOfAccounts.add(new Account(userInputAccountNumber));
        System.out.println("Kontot är registrerat");
        break;
        } 
                
            
        }
    }

    public void accountMenu(){
        boolean menyOn = true;
        boolean accountNotValid = true;
        int activeAccountIndex;

        System.out.println("Skriv in ditt kontonummer: ");
        int userInputAccountNumber = myScanner.nextInt();

        for (int i = 0; i < listOfAccounts.size(); i++){
            if(userInputAccountNumber == listOfAccounts.get(i).accountNumber){
                activeAccountIndex = i;
                System.out.println("\n" + "kontot finns registrerat på index plats: " + activeAccountIndex);
                System.out.println("Välkommen!" + "\n");
                accountNotValid = false;
            }
        }
        if(accountNotValid == true){
        System.out.println("Kontot finns ej registrerat!");
        menyOn= false;
        }
        


        while(menyOn){

            System.out.println("**** KONTOMENY ****");
            System.out.println("1. Ta ut pengar");
            System.out.println("2. Sätt in pengar");
            System.out.println("3. Visa saldo");
            System.out.println("4. Avsluta");
            int userChoice = myScanner.nextInt();

            switch(userChoice){
                case 4: 
                System.out.println("\n" + "Tillbaka till menyn...");
                menyOn = false;
            }

        }
    }
    









    public void listAllAcounts(){
        if(listOfAccounts.size() == 0){
            System.out.println("Det finns ej några registrerade konton");
        }
        else{
            System.out.println("*** Listar ut alla registrerade konton nedan ***");

            for( int i = 0; i < listOfAccounts.size(); i++){
             System.out.println(listOfAccounts.get(i).getAccountNumber());
            }
        }
    }
}
