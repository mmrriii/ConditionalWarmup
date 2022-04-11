import java.util.Scanner;

public class MyATM {
    public static void main(String[] args) {
        double yourBalance = 1500;
        String heyMessage = "hey! i'm ATM.\n Please enter your value";
        String balanceMessage = "your balance now is: ";
        String incorrectValueMessage = "incorrect value !!";
        String finishMessage = "program finished";
        Scanner yourScan = new Scanner(System.in);
        System.out.println(heyMessage);
        double yourCash = yourScan.nextDouble();
        yourBalance -= yourCash;
        if (yourCash > 0) {
            System.out.println(balanceMessage + yourBalance);
        } else {
            System.out.println(incorrectValueMessage);
        }
        System.out.println(finishMessage);


    }


}
