public class JavaMart {
    public static void main(String[] args) {
        double wallet = 50;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet >= toyCar) {
            System.out.println("Sure");
            wallet -= toyCar;
        } else {
            System.out.printf("Sorry, I only have $ %.2f left.\n", wallet);
        }

        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
  
        //else: Sorry, I only have <wallet> left.

        if (wallet >= nike) {
            System.out.println("Sure");
            wallet -= nike;
        } else {
            System.out.printf("Sorry, I only have $ %.2f left.\n", wallet);
        }

    }
}
