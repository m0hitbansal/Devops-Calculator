package calculator;
import org.apache.log4j.Logger;

import java.util.Scanner;
public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
	System.out.println("Welcome to Dev- ops world");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1=0.0, number2=0.0;
        do {
            System.out.println("Choose to perform operation");
            System.out.println("Press 1 to Add\nPress 2 to Subtract\nPress 3 to Multiply\nPress 4 to Divide\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            if(choice<5 && choice>0) {
                System.out.print("Enter the first number : ");
                number1 = scanner.nextDouble();
                System.out.print("Enter the second number : ");
                number2 = scanner.nextDouble();
            }
            switch (choice) {
                case 1:

                    System.out.println("Addition two number "+number1+ " and "+number2 +"  is : " + calculator.add(number1, number2));
                    break;
                case 2:
               

                    System.out.println("Subtraction two number "+number1+ " and "+number2 +" is : " + calculator.subtract(number1, number2));
                    break;
                case 3:
                   

                    System.out.println("Multiplication two number "+number1+ " and "+number2 +" is : " + calculator.multiply(number1, number2));
                    break;
                case 4:
                  
                    System.out.println("Multiplication "+number1+ " and "+number2 +" is : " + calculator.divide(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double add(double number1, double number2) {
        logger.info("Adding two numbers " + number1 + " and " + number2);
        double result = number1 + number2;
        logger.info("Result of addition is " + result);
        return result;
    }

    public double subtract(double number1, double number2) {
        logger.info("Subtracting two numbers " + number1 + " and " + number2);
        double result = number1 - number2;
        logger.info("Result of subtraction is " + result);
        return result;
    }


    public double multiply(double number1, double number2) {
        logger.info("Multiplying two numbers " + number1 + " and " + number2);
        double result = number1 * number2;
        logger.info("Result of multiplication is " + result);
        return result;
    }

    public double divide(double number1, double number2) {
        double result = 0;
        try {
            logger.info("Dividing two numbers " + number1 + " and " + number2);
            if (number1 == 0 && number2 == 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of  0.0/0.0");
            } else if (number1 > 0 && number2 == 0) {
                result = Double.POSITIVE_INFINITY;
                throw new ArithmeticException("Case of  1.0/0.0");
            } else if (number1 <= -1 && number2 == 0) {
                result = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Case of  -1.0/0.0");
            } else {
                result = number1 / number2;
            }
        } catch (ArithmeticException error) {
            logger.error("Number cannot be divided by zero " + error.getLocalizedMessage());
        } finally {
            logger.info("Result of dividing is " + result);
        }
        return result;
    }
}
