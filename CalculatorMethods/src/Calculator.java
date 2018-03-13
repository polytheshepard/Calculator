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
            System.out.println("If you wish to exit the calculator, press X or x");

            // prompts user input
            System.out.print("\nEnter your selection: ");
            input = scan.nextLine();

            // If there's an error in not inputting any of the operators or x
            if(!"+".equals(input)
                    && !"-".equals(input)
                    && !"*".equals(input)
                    && !"/".equals(input)
                    && !"X".equals(input)
                    && !"x".equals(input)){
                System.out.println("Not a correct operator.");
            } else {
                System.out.println("\nSuccess!");
                switch (input) {
                    case "+":
                        System.out.print("Enter first value: ");
                        int add1 = scan.nextInt();

                        System.out.print("Enter your second value: ");
                        int add2 = scan.nextInt();
                        System.out.println(addition(add1, add2));
                        break;
                    case "-":
                        System.out.print("Enter first value: ");
                        int minus1 = scan.nextInt();

                        System.out.print("Enter second value: ");
                        int minus2 = scan.nextInt();
                        System.out.println(subtraction(minus1, minus2));
                        break;
                    case "*":
                        System.out.print("Enter first value: ");
                        int multiply1 = scan.nextInt();

                        System.out.print("Enter second value: ");
                        int multiply2 = scan.nextInt();
                        System.out.println(multiplication(multiply1, multiply2));
                        break;
                    case "/":
                        System.out.print("Enter first value: ");
                        int divide1 = scan.nextInt();

                        System.out.print("Enter second value: ");
                        int divide2 = scan.nextInt();
                        System.out.println(division(divide1, divide2));
                        break;
                    case "x":
                    case "X":
                        System.out.println("Calculator exiting...");
                    default:

                }
            }

            System.out.println();
            // refer to extended class for subtraction, addition, multiplication and division methods
        } while (!"x".equals(input));
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
