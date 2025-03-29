import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        boolean continueOperation = true;

        System.out.println("Welcome to the Java Calculator!");

        while (continueOperation)
        {
            System.out.print("Enter an operation (+,-,*,/) or exit: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit"))
            {
                System.out.println ("Exiting Calculator...");
                break;
            }
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"))
            {
                System.out.println("Invalid operations. Please enter one of the following: +,-,*,/.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
        if (num1 < -1000 || num1 > 1000)
        {
            System.out.println("Error: please choose a number between -1000 and 1000.");
            scanner.nextLine();
            continue;
        }

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
        if (num2 < -1000 || num2 > 1000)
        {
            System.out.println("Error: please choose a number between -1000 and 1000.");
            scanner.nextLine();
            continue;
        }

            scanner.nextLine();

            double result = 0;
            boolean validOperation = true;

            switch (operation) 
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) 
                    {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false; 
                    } else {
                        result = num1 / num2;

                    }
                    break;

            }
            if (validOperation) 
            {
                System.out.println("Result:" + result);
            }

            System.out.print("Do you want to perform another operation? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no"))
            {
                System.out.println("Thank you for using the Java Calculator! Goodbye!");
                continueOperation = false;
            }

            
        } 
            scanner.close();
    }
}