import java.util.Scanner;

public class Methods {
    Scanner myScanner = new Scanner(System.in);

    public void addNumbers(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println("Summan blev: " + result);
    }
    public void divideNumbers(double firstNumber, double secondNumber){
        double result = firstNumber / secondNumber;
        System.out.println(firstNumber + " dividerat med " + secondNumber + " är: " + result);
    }
    public void subtractNumbers(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println(firstNumber + " minus " + secondNumber + " är: " + result);
    }
    public void multiplyNumber(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
         System.out.println(firstNumber + " multipliserat med " + secondNumber + " är: " + result);
    }
}
