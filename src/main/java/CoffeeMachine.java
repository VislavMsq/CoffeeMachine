import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        boolean choiceValid = false;
        while (!choiceValid) {
            System.out.print("1 - Espresso" + "\n" +
                    "2 - Americano" + "\n" +
                    "3 - Сappuccino" + "\n" +
                    "4 - Tea" + "\n" +
                    "Choose a drink:");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("You choosed: Espresso");
                choiceValid = true;
                MakeDrink.makeEspresso();
            } else if (choice == 2) {
                System.out.println("You choosed: Americano");
                choiceValid = true;
                MakeDrink.makeAmericano();
            } else if (choice == 3) {
                System.out.println("You choosed: Cappuccino");
                choiceValid = true;
                MakeDrink.makeCappuccino();
            } else if (choice == 4) {
                System.out.println("You choosed: Tea");
                choiceValid = true;
                MakeDrink.makeTea();
            } else {
                System.out.println("Choose a drink");
            }

        }
        sc.close();

    }

//    public static void makeEspresso() throws InterruptedException {
//        System.out.println("Make espresso, white pls ...");
//        Thread.sleep(2000);
//        System.out.println("Your drink ready!");
//    }
//
//    public static void makeAmericano() throws InterruptedException {
//        System.out.println("Make americano, white pls ...");
//        Thread.sleep(2000);
//        System.out.println("Added water, white pls!");
//        Thread.sleep(2000);
//        System.out.println("Your drink ready!");
//    }
//
//    public static void makeCappuccino() throws InterruptedException {
//        System.out.println("Make cappuccino, white pls ...");
//        Thread.sleep(2000);
//        System.out.println("Added milk, white pls!");
//        Thread.sleep(2000);
//        System.out.println("Your drink ready!");
//    }
//
//    public static void makeTea() throws InterruptedException {
//        System.out.println("Make tea, white pls ...");
//        Thread.sleep(2000);
//        System.out.println("Your drink ready!");
//    }
}
