import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNum, secondNum;
        char operator;

        System.out.print("Enter first number: ");
        firstNum = scan.nextDouble();

        System.out.print("Enter second number: ");
        secondNum = scan.nextDouble();

        // scan.next().charAt(0) looks for the next character that starts at from the
        // first index
        System.out.print("Enter an operator (+ - / *): ");
        operator = scan.next().charAt(0);

        scan.close();
        double output;

        // Start of switch case for operator based on user who puts in characters
        switch(operator) {
            case '+':
                output = firstNum + secondNum;
                break;
            case '-':
                output = firstNum - secondNum;
                break;
            case '/':
                output = firstNum / secondNum;
                break;
            case '*':
                output = firstNum * secondNum;
                break;
            default:
                System.out.println("You have entered the wrong operator. Try again.");
                return;
        }
        System.out.println(firstNum+" "+operator+" "+secondNum+" = "+output);
;    }
}
