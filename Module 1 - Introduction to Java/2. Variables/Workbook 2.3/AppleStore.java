public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.4;
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers++;
        profit = price * 4;
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers++;
        numOfApples -= 20;
        profit += price * 20;
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers++;
        numOfApples -= 200;
        profit += price * 200;

        System.out.printf("Wow! So far, you made: $%.2f\n", profit);
        System.out.printf("%d customers love your apples.\n", numOfCustomers);
        System.out.printf("You have %d apples left.\n", numOfApples);

    }

}
