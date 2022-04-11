import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String heyMessage = "Hey, please enter a number";
        String positiveMessage = "this number is positive";
        String negativeMessage = "this number is negative";
        String zeroMessage = "this number is zero";
        Scanner myScan = new Scanner(System.in);
        System.out.println(heyMessage);
        double number = myScan.nextDouble();
        if (number > 0) {
            System.out.println(positiveMessage);
        } else if (number < 0) {
            System.out.println(negativeMessage);

        } else {
            System.out.println(zeroMessage);
        }
        if (number % 2 == 0) {
            System.out.println("this number is even");
        } else System.out.println("this number is odd");
    }
}




