import java.util.Scanner;

public class ShopMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" please, enter hour ");
        int hour = scanner.nextInt();
        if ((hour > 8) && (hour < 18)) {

            System.out.println("you can go to work");

        } else if (hour > 18 && hour <= 24) {
            System.out.println("you can go home or visit some supermarkets");

            if (hour < 23) {
                System.out.println("you can buy some food");

            } else {
                System.out.println("all shops are closed");
            }

        } else {
            System.out.println("error !!");
        }
    }


    }




