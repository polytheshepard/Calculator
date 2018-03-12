import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        char selection = '\0';

        // Menu starts here
        do {
            //add menu here
            System.out.println("*****Calculator*****");
            System.out.println("");
            System.out.println("Choose one of the operators + - * /");
            System.out.println("If you wish to exit the calculator, press X");

            // prompts user input
            System.out.print("Enter your selection");
            input = scan.nextLine();

            switch(input) {
                case "+":
                    System.out.print("Enter first value");
                    int value1 = scan.nextInt();

                    System.out.print("Enter your second value");
                    int value2 = scan.nextInt();
                    System.out.println(addition(value1, value2));
                    break;
                case "-":
                    System.out.print("Enter first value");
                    int value3 = scan.nextInt();

                    System.out.print("Enter second value");
                    int value4 = scan.nextInt();
                    System.out.println(subtraction(value3,value4));
                    break;
                case "*":
                    System.out.print("Enter first value");
                    int value5 = scan.nextInt();

                    System.out.print("Enter second value");
                    int value6 = scan.nextInt();
                    System.out.println(multiplication(value5, value6));
                    break;
                case "/":
                    System.out.print("Enter first value");
                    int value7 = scan.nextInt();

                    System.out.print("Enter second value");
                    int value8 = scan.nextInt();
                    System.out.println(division(value7, value8));
                    break;
                default:

            }

            System.out.println();
            // refer to extended class for subtraction, addition, multiplication and division methods
        } while (selection != 'X');
    }

    private static double addition(double x, double y) {
        double z;
        z = x + y;
        return z;
    }

    private static double subtraction(double x, double y) {
        double z;
        z = x - y;
        return z;
    }

    private static double division(double x, double y) {
        double z;
        z = x / y;
        return z;
    }

    private static double multiplication(double x, double y) {
        double z;
        z = x * y;
        return z;
    }
}
