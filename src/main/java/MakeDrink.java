public class MakeDrink {
    /**
     * Сделал методы для создания напитка. Установил задержку
     * @throws InterruptedException познакомился с экшепшинами связанными с установкой задержки
     */
    public static void makeEspresso() throws InterruptedException {
        System.out.println("Make espresso, wait pls ...");
        Thread.sleep(2000);
        System.out.println("Your drink ready!");
    }

    public static void makeAmericano() throws InterruptedException {
        System.out.println("Make americano, wait pls ...");
        Thread.sleep(2000);
        System.out.println("Added water!");
        Thread.sleep(2000);
        System.out.println("Your drink ready!");
    }

    public static void makeCappuccino() throws InterruptedException {
        System.out.println("Make cappuccino, wait pls ...");
        Thread.sleep(2000);
        System.out.println("Added hot milk!");
        Thread.sleep(2000);
        System.out.println("Your drink ready!");
    }

    public static void makeTea() throws InterruptedException {
        System.out.println("Make tea, wait pls ...");
        Thread.sleep(2000);
        System.out.println("Your drink ready!");
    }
}
