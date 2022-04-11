import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumMessage = "Enter first number";
        String secondNumMessage = "Enter second number";
        System.out.println(firstNumMessage);
        int firstNumber = scanner.nextInt();
        System.out.println(secondNumMessage);
        int secondNumber = scanner.nextInt();
        System.out.println("Choose operation: ");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multi");
        System.out.println("4 - div");
        System.out.println("5 - modulus");
        int operation = scanner.nextInt();
        int result = 0;
        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;
            case 5:
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Error!!");
        }

        System.out.println("result: " + result);
    }


}
